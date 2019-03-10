package com.gbst.dca.services.dca;


import com.gbst.dca.dto.CollHeld;
import com.gbst.dca.dto.Financials;
import com.gbst.dca.dto.LedgerActivity;
import com.gbst.dca.dto.OpenPos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.text.MessageFormat;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

@Component
public class DtoService {

	@Autowired
	@Qualifier("dcaEntityManager")
	EntityManager em;

	@Autowired
	@Qualifier("dcaDataSource")
	DataSource dataSource;

	@Autowired
	@Qualifier("dcahDataSource")
	DataSource dcahDataSource;

	@Autowired
	SysService sysService;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public List<OpenPos> OpenPosition(Integer accId) {

		JdbcTemplate template = new JdbcTemplate(dataSource);

		List<OpenPos> result = template.query("sp_pa_ExplorerOPdetail " + accId.toString(), new BeanPropertyRowMapper<>(OpenPos.class));
		return result;
	}

	public List<CollHeld> retrieveCollateralHeld(Integer accId) {

		JdbcTemplate template = new JdbcTemplate(dataSource);

		List<CollHeld> result = template.query("sp_pa_ExplorerCH " + accId.toString() + ", 1", new BeanPropertyRowMapper<>(CollHeld.class));
		return result;
	}


	public Financials retrieveFinancials(Integer accId) {

		JdbcTemplate template = new JdbcTemplate(dataSource);

		List<Financials> list = template.query("sp_pa_ExplorerFS " + accId.toString() + ", 1, 1", new BeanPropertyRowMapper<>(Financials.class));

		Financials result = new Financials();

		if(list.size() > 0){
			result = list.get(0);
		}

		return result;
	}

	public List<LedgerActivity> retrieveLedgerActivity(Integer accId, String rptPeriod, LocalDate from, LocalDate to) {

		List<LedgerActivity> result;
		if(from == null){
			result = retrieveCurrent(accId, rptPeriod);
		}
		else {
			result = retrieveHistory(accId, from, to);
		}

		return result;
	}

	private List<LedgerActivity> retrieveCurrent(Integer accId, String rptPeriod){

		JdbcTemplate template = new JdbcTemplate(dataSource);
		List<String> params = new ArrayList<>();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
		LocalDate from;
		LocalDate to;

		YearMonth ym = YearMonth.from(sysService.find().get(0).getBusDate().toLocalDate());

		if(rptPeriod.toLowerCase().contains("p")){
			ym = ym.minusMonths(1);
		}

		from = ym.atDay(1);
		to = ym.atEndOfMonth();

		params.add(accId.toString());
		params.add(rptPeriod);
		params.add(from.format(dateFormat));
		params.add(to.format(dateFormat));
		params.add("1");
		params.add("1");

		MessageFormat msg = new MessageFormat("sp_pa_ExplorerCurrLA {0}, ''{1}'', ''{2}'', ''{3}'', {4}, {5}");
		String sproc = msg.format(params.toArray());

		logger.debug(sproc);

		List<LedgerActivity> result = template.query(sproc, new BeanPropertyRowMapper<>(LedgerActivity.class));

		return result;
	}

	private List<LedgerActivity> retrieveHistory(Integer accId, LocalDate from, LocalDate to){

		JdbcTemplate template = new JdbcTemplate(dcahDataSource);
		List<String> params = new ArrayList<>();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");

		params.add(accId.toString());
		params.add(from.format(dateFormat));
		params.add(to.format(dateFormat));
		params.add("1");
		params.add("1");

		MessageFormat msg = new MessageFormat("sp_pa_ExplorerHistLA {0}, ''{1}'', ''{2}'', {3}, {4}");
		String sproc = msg.format(params.toArray());

		logger.debug(sproc);

		List<LedgerActivity> result = template.query(sproc, new BeanPropertyRowMapper<>(LedgerActivity.class));

		return result;
	}
}

