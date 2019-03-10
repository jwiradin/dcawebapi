package com.gbst.dca.domain.dca;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;
import org.hibernate.annotations.JoinFormula;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the Acc database table.
 * 
 */
@Entity
@NamedQuery(name="Acc.findAll", query="SELECT a FROM Acc a")
@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "getSproc",
				procedureName = "usp_pa_getAcc",
				parameters = {
						@StoredProcedureParameter(mode = ParameterMode.IN, name = "accId", type = Integer.class)
				},
				resultClasses = Acc.class)
})
public class Acc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AccID")
	private int accID;

	@Column(name="ABN")
	private String abn;

	@Column(name="Acc")
	private String acc;

	@Column(name="AccDeleted")
	private boolean accDeleted;

	@Column(name="AccName")
	private String accName;

	@Column(name="AccNotifyCH")
	private boolean accNotifyCH;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumnsOrFormulas({
			@JoinColumnOrFormula(formula = @JoinFormula(value="'AccStatus'", referencedColumnName = "codeType")),
			@JoinColumnOrFormula(column=@JoinColumn(name="accStat", referencedColumnName = "codeVal"))
	})
	private CodeVal accStat;
/*
	@Column(name="AccTypeID")
	private int accTypeID;
*/
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "accTypeID",referencedColumnName = "accTypeID")
	private AccType accType;

	@Column(name="ActivityPostingStyle")
	private String activityPostingStyle;

	@Column(name="AgreementRecd")
	private Timestamp agreementRecd;

	@Column(name="ApplyCHFees")
	private boolean applyCHFees;

	@Column(name="AssocMbrID")
	private int assocMbrID;

	@Column(name="AutoExer")
	private boolean autoExer;

	@Column(name="AutoMatchOut")
	private boolean autoMatchOut;

	@Column(name="BankAccNo")
	private String bankAccNo;

	@Column(name="BSB")
	private String bsb;

	@Column(name="CalcInt")
	private int calcInt;

	private String CHAccType;

	private Timestamp CHDateCreated;

	@Column(name="CHESS")
	private short chess;

	private String CMTAccCode;

	@Column(name="CommAccGrpID")
	private int commAccGrpID;

	@Column(name="CompanyNum")
	private String companyNum;

	@Column(name="ContactName")
	private String contactName;

	@Column(name="ContIntScaleID")
	private int contIntScaleID;

	@Column(name="ConvInt")
	private boolean convInt;

	@Column(name="CoverGrp")
	private String coverGrp;

	@Column(name="CoverGrpSeq")
	private int coverGrpSeq;

	@Column(name="CreateDate")
	private Timestamp createDate;

	@Column(name="CreatePDF")
	private String createPDF;

	private int CRPostCodeID;

	@Column(name="CurConv")
	private short curConv;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="curID", referencedColumnName = "curId")
	private Cur cur;

	@Column(name="DailyCommCharge")
	private BigDecimal dailyCommCharge;

	@Column(name="DefRT")
	private String defRT;

	private int DRPostCodeID;

	private String EMail;

	@Column(name="EqtClearID")
	private int eqtClearID;

	@Column(name="ExerSched")
	private String exerSched;

	@Column(name="Fax")
	private String fax;

	private String GSTStatus;

	@Column(name="IntScaleID")
	private int intScaleID;

	@Column(name="IntSchdID")
	private int intSchdID;

	@Column(name="LastPosnActivity")
	private Timestamp lastPosnActivity;

	@Column(name="LastUpdate")
	private Timestamp lastUpdate;

	@Column(name="LEPOS")
	private short lepos;

	@Column(name="MarginMult")
	private BigDecimal marginMult;

	@Column(name="MarginSchdID")
	private int marginSchdID;

	@Column(name="Notes")
	private String notes;

	@Column(name="PackageFurn")
	private short packageFurn;

	@Column(name="Paperless")
	private short paperless;

	@Column(name="PosAttactMargins")
	private short posAttactMargins;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "riskProfileID",referencedColumnName = "riskProfileID")
	private RiskProfile riskProfile;


	@Column(name="RiskStatus")
	private String riskStatus;

	@Column(name="ScripCover")
	private short scripCover;

	@Column(name="SellToClose")
	private short sellToClose;

	@Column(name="SettDayTrades")
	private boolean settDayTrades;

	@Column(name="SettleInstr")
	private String settleInstr;

	@Column(name="SettleLocation")
	private String settleLocation;

	@Column(name="SettleMethod")
	private String settleMethod;

	@Column(name="SettleNetting")
	private String settleNetting;

	@Column(name="SettleSweep")
	private String settleSweep;

	@Column(name="SettLikeRefs")
	private boolean settLikeRefs;

	@Column(name="SettMthd")
	private String settMthd;

	@Column(name="SpecificCover")
	private String specificCover;

	@Column(name="Staff")
	private boolean staff;

	@Column(name="SuspRptExtract")
	private String suspRptExtract;

	@Column(name="Tel")
	private String tel;

	@Column(name="UpdateCount")
	private short updateCount;

	@Column(name="UpdateNumber")
	@Transient
	private Timestamp updateNumber;

	@ManyToOne(targetEntity = Corporate.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "CorporateId")
	@JsonManagedReference
	private Corporate corporate;

	@OneToMany(mappedBy="acc", fetch=FetchType.LAZY)
	private List<AccAddress> accAddresses;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Advisor.class)
	@JoinTable(name = "GrpAcc", joinColumns = @JoinColumn(name = "accId", referencedColumnName = "accId"),
			inverseJoinColumns = @JoinColumn(name = "grpId", referencedColumnName = "grpId"))
	private List<Advisor> advisors;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Associated.class)
	@JoinTable(name = "GrpAcc", joinColumns = @JoinColumn(name = "accId", referencedColumnName = "accId"),
			inverseJoinColumns = @JoinColumn(name = "grpId", referencedColumnName = "grpId"))
	private List<Associated> associateds;

	public Acc() {
	}

	public int getAccID() {
		return this.accID;
	}

	public void setAccID(int accID) {
		this.accID = accID;
	}

	public String getAbn() {
		return this.abn;
	}

	public void setAbn(String abn) {
		this.abn = abn;
	}

	public String getAcc() {
		return this.acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public boolean getAccDeleted() {
		return this.accDeleted;
	}

	public void setAccDeleted(boolean accDeleted) {
		this.accDeleted = accDeleted;
	}

	public String getAccName() {
		return this.accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public boolean getAccNotifyCH() {
		return this.accNotifyCH;
	}

	public void setAccNotifyCH(boolean accNotifyCH) {
		this.accNotifyCH = accNotifyCH;
	}

	public CodeVal getAccStat() {
		return this.accStat;
	}

	public void setAccStat(CodeVal accStat) {
		this.accStat = accStat;
	}

	public String getActivityPostingStyle() {
		return this.activityPostingStyle;
	}

	public void setActivityPostingStyle(String activityPostingStyle) {
		this.activityPostingStyle = activityPostingStyle;
	}

	public Timestamp getAgreementRecd() {
		return this.agreementRecd;
	}

	public void setAgreementRecd(Timestamp agreementRecd) {
		this.agreementRecd = agreementRecd;
	}

	public boolean getApplyCHFees() {
		return this.applyCHFees;
	}

	public void setApplyCHFees(boolean applyCHFees) {
		this.applyCHFees = applyCHFees;
	}

	public int getAssocMbrID() {
		return this.assocMbrID;
	}

	public void setAssocMbrID(int assocMbrID) {
		this.assocMbrID = assocMbrID;
	}

	public boolean getAutoExer() {
		return this.autoExer;
	}

	public void setAutoExer(boolean autoExer) {
		this.autoExer = autoExer;
	}

	public boolean getAutoMatchOut() {
		return this.autoMatchOut;
	}

	public void setAutoMatchOut(boolean autoMatchOut) {
		this.autoMatchOut = autoMatchOut;
	}

	public String getBankAccNo() {
		return this.bankAccNo;
	}

	public void setBankAccNo(String bankAccNo) {
		this.bankAccNo = bankAccNo;
	}

	public String getBsb() {
		return this.bsb;
	}

	public void setBsb(String bsb) {
		this.bsb = bsb;
	}

	public int getCalcInt() {
		return this.calcInt;
	}

	public void setCalcInt(int calcInt) {
		this.calcInt = calcInt;
	}

	public String getCHAccType() {
		return this.CHAccType;
	}

	public void setCHAccType(String CHAccType) {
		this.CHAccType = CHAccType;
	}

	public Timestamp getCHDateCreated() {
		return this.CHDateCreated;
	}

	public void setCHDateCreated(Timestamp CHDateCreated) {
		this.CHDateCreated = CHDateCreated;
	}

	public short getChess() {
		return this.chess;
	}

	public void setChess(short chess) {
		this.chess = chess;
	}

	public String getCMTAccCode() {
		return this.CMTAccCode;
	}

	public void setCMTAccCode(String CMTAccCode) {
		this.CMTAccCode = CMTAccCode;
	}

	public int getCommAccGrpID() {
		return this.commAccGrpID;
	}

	public void setCommAccGrpID(int commAccGrpID) {
		this.commAccGrpID = commAccGrpID;
	}

	public String getCompanyNum() {
		return this.companyNum;
	}

	public void setCompanyNum(String companyNum) {
		this.companyNum = companyNum;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public int getContIntScaleID() {
		return this.contIntScaleID;
	}

	public void setContIntScaleID(int contIntScaleID) {
		this.contIntScaleID = contIntScaleID;
	}

	public boolean getConvInt() {
		return this.convInt;
	}

	public void setConvInt(boolean convInt) {
		this.convInt = convInt;
	}

	public Corporate getCorporate() {
		return this.corporate;
	}

	public void setCorporate(Corporate corporate) {
		this.corporate = corporate;
	}

	public String getCoverGrp() {
		return this.coverGrp;
	}

	public void setCoverGrp(String coverGrp) {
		this.coverGrp = coverGrp;
	}

	public int getCoverGrpSeq() {
		return this.coverGrpSeq;
	}

	public void setCoverGrpSeq(int coverGrpSeq) {
		this.coverGrpSeq = coverGrpSeq;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCreatePDF() {
		return this.createPDF;
	}

	public void setCreatePDF(String createPDF) {
		this.createPDF = createPDF;
	}

	public int getCRPostCodeID() {
		return this.CRPostCodeID;
	}

	public void setCRPostCodeID(int CRPostCodeID) {
		this.CRPostCodeID = CRPostCodeID;
	}

	public short getCurConv() {
		return this.curConv;
	}

	public void setCurConv(short curConv) {
		this.curConv = curConv;
	}

	public BigDecimal getDailyCommCharge() {
		return this.dailyCommCharge;
	}

	public void setDailyCommCharge(BigDecimal dailyCommCharge) {
		this.dailyCommCharge = dailyCommCharge;
	}

	public String getDefRT() {
		return this.defRT;
	}

	public void setDefRT(String defRT) {
		this.defRT = defRT;
	}

	public int getDRPostCodeID() {
		return this.DRPostCodeID;
	}

	public void setDRPostCodeID(int DRPostCodeID) {
		this.DRPostCodeID = DRPostCodeID;
	}

	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	public int getEqtClearID() {
		return this.eqtClearID;
	}

	public void setEqtClearID(int eqtClearID) {
		this.eqtClearID = eqtClearID;
	}

	public String getExerSched() {
		return this.exerSched;
	}

	public void setExerSched(String exerSched) {
		this.exerSched = exerSched;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getGSTStatus() {
		return this.GSTStatus;
	}

	public void setGSTStatus(String GSTStatus) {
		this.GSTStatus = GSTStatus;
	}

	public int getIntScaleID() {
		return this.intScaleID;
	}

	public void setIntScaleID(int intScaleID) {
		this.intScaleID = intScaleID;
	}

	public int getIntSchdID() {
		return this.intSchdID;
	}

	public void setIntSchdID(int intSchdID) {
		this.intSchdID = intSchdID;
	}

	public Timestamp getLastPosnActivity() {
		return this.lastPosnActivity;
	}

	public void setLastPosnActivity(Timestamp lastPosnActivity) {
		this.lastPosnActivity = lastPosnActivity;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public short getLepos() {
		return this.lepos;
	}

	public void setLepos(short lepos) {
		this.lepos = lepos;
	}

	public BigDecimal getMarginMult() {
		return this.marginMult;
	}

	public void setMarginMult(BigDecimal marginMult) {
		this.marginMult = marginMult;
	}

	public int getMarginSchdID() {
		return this.marginSchdID;
	}

	public void setMarginSchdID(int marginSchdID) {
		this.marginSchdID = marginSchdID;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public short getPackageFurn() {
		return this.packageFurn;
	}

	public void setPackageFurn(short packageFurn) {
		this.packageFurn = packageFurn;
	}

	public short getPaperless() {
		return this.paperless;
	}

	public void setPaperless(short paperless) {
		this.paperless = paperless;
	}

	public short getPosAttactMargins() {
		return this.posAttactMargins;
	}

	public void setPosAttactMargins(short posAttactMargins) {
		this.posAttactMargins = posAttactMargins;
	}

	public String getRiskStatus() {
		return this.riskStatus;
	}

	public void setRiskStatus(String riskStatus) {
		this.riskStatus = riskStatus;
	}

	public short getScripCover() {
		return this.scripCover;
	}

	public void setScripCover(short scripCover) {
		this.scripCover = scripCover;
	}

	public short getSellToClose() {
		return this.sellToClose;
	}

	public void setSellToClose(short sellToClose) {
		this.sellToClose = sellToClose;
	}

	public boolean getSettDayTrades() {
		return this.settDayTrades;
	}

	public void setSettDayTrades(boolean settDayTrades) {
		this.settDayTrades = settDayTrades;
	}

	public String getSettleInstr() {
		return this.settleInstr;
	}

	public void setSettleInstr(String settleInstr) {
		this.settleInstr = settleInstr;
	}

	public String getSettleLocation() {
		return this.settleLocation;
	}

	public void setSettleLocation(String settleLocation) {
		this.settleLocation = settleLocation;
	}

	public String getSettleMethod() {
		return this.settleMethod;
	}

	public void setSettleMethod(String settleMethod) {
		this.settleMethod = settleMethod;
	}

	public String getSettleNetting() {
		return this.settleNetting;
	}

	public void setSettleNetting(String settleNetting) {
		this.settleNetting = settleNetting;
	}

	public String getSettleSweep() {
		return this.settleSweep;
	}

	public void setSettleSweep(String settleSweep) {
		this.settleSweep = settleSweep;
	}

	public boolean getSettLikeRefs() {
		return this.settLikeRefs;
	}

	public void setSettLikeRefs(boolean settLikeRefs) {
		this.settLikeRefs = settLikeRefs;
	}

	public String getSettMthd() {
		return this.settMthd;
	}

	public void setSettMthd(String settMthd) {
		this.settMthd = settMthd;
	}

	public String getSpecificCover() {
		return this.specificCover;
	}

	public void setSpecificCover(String specificCover) {
		this.specificCover = specificCover;
	}

	public boolean getStaff() {
		return this.staff;
	}

	public void setStaff(boolean staff) {
		this.staff = staff;
	}

	public String getSuspRptExtract() {
		return this.suspRptExtract;
	}

	public void setSuspRptExtract(String suspRptExtract) {
		this.suspRptExtract = suspRptExtract;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public short getUpdateCount() {
		return this.updateCount;
	}

	public void setUpdateCount(short updateCount) {
		this.updateCount = updateCount;
	}

	public Timestamp getUpdateNumber() {
		return this.updateNumber;
	}

	public void setUpdateNumber(Timestamp updateNumber) {
		this.updateNumber = updateNumber;
	}

	public List<AccAddress> getAccAddresses() {
		return this.accAddresses;
	}

	public void setAccAddresses(List<AccAddress> accAddresses) {
		this.accAddresses = accAddresses;
	}

	public List<Advisor> getAdvisors() {
		return advisors;
	}

	public void setAdvisors(List<Advisor> advisors) {
		this.advisors = advisors;
	}

	public List<Associated> getAssociateds() {
		return associateds;
	}

	public void setAssociateds(List<Associated> associateds) {
		this.associateds = associateds;
	}

	public AccType getAccType() {
		return accType;
	}

	public void setAccType(AccType accType) {
		this.accType = accType;
	}

	public RiskProfile getRiskProfile() {
		return riskProfile;
	}

	public void setRiskProfile(RiskProfile riskProfile) {
		this.riskProfile = riskProfile;
	}

	public Cur getCur() {
		return cur;
	}

	public void setCur(Cur cur) {
		this.cur = cur;
	}

	public AccAddress addAccAddress(AccAddress accAddress) {
		getAccAddresses().add(accAddress);
		accAddress.setAcc(this);

		return accAddress;
	}

	public AccAddress removeAccAddress(AccAddress accAddress) {
		getAccAddresses().remove(accAddress);
		accAddress.setAcc(null);

		return accAddress;
	}

}