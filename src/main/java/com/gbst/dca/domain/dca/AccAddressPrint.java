package com.gbst.dca.domain.dca;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.*;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import java.sql.Timestamp;


/**
 * The persistent class for the AccAddressPrint database table.
 * 
 */
@Entity
@NamedQuery(name="AccAddressPrint.findAll", query="SELECT a FROM AccAddressPrint a")
public class AccAddressPrint implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AccAddressPrintPK id;

	@Column(name="CancelPrint")
	private String cancelPrint;

	@Column(name="ExclFromGrp")
	private String exclFromGrp;

	@Column(name="ExtractFreq")
	private String extractFreq;

	@Column(name="UpdateNumber")
	@Transient
	private Timestamp updateNumber;

	//bi-directional many-to-one association to AccAddress
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="AccID", referencedColumnName="AccID", insertable = false, updatable = false),
		@JoinColumn(name="AddNum", referencedColumnName="AddNum", insertable = false, updatable = false)
		})
	@JsonBackReference
	private AccAddress accAddress;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumnsOrFormulas({
			@JoinColumnOrFormula(formula = @JoinFormula(value="'CAADDRPRINT'", referencedColumnName = "codeType")),
			@JoinColumnOrFormula(column=@JoinColumn(name="ReportID", referencedColumnName = "codeVal", insertable = false, updatable = false))
	})
	private CodeVal report;


	public AccAddressPrint() {
	}

	public AccAddressPrintPK getId() {
		return this.id;
	}

	public void setId(AccAddressPrintPK id) {
		this.id = id;
	}

	public String getCancelPrint() {
		return this.cancelPrint;
	}

	public void setCancelPrint(String cancelPrint) {
		this.cancelPrint = cancelPrint;
	}

	public String getExclFromGrp() {
		return this.exclFromGrp;
	}

	public void setExclFromGrp(String exclFromGrp) {
		this.exclFromGrp = exclFromGrp;
	}

	public String getExtractFreq() {
		return this.extractFreq;
	}

	public void setExtractFreq(String extractFreq) {
		this.extractFreq = extractFreq;
	}

	public Timestamp getUpdateNumber() {
		return this.updateNumber;
	}

	public void setUpdateNumber(Timestamp updateNumber) {
		this.updateNumber = updateNumber;
	}

	public AccAddress getAccAddress() {
		return this.accAddress;
	}

	public void setAccAddress(AccAddress accAddress) {
		this.accAddress = accAddress;
	}

	public CodeVal getReport() {
		return report;
	}

	public void setReport(CodeVal report) {
		this.report = report;
	}


}