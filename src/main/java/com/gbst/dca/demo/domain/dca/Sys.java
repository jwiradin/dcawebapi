package com.gbst.dca.demo.domain.dca;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * The persistent class for the Sys database table.
 *
 */
@Entity
@Table(name="Sys")
@NamedQuery(name="Sy.findAll", query="SELECT s FROM Sys s")
public class Sys implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MyMbrId")
	private int myMbrId;

	@Column(name="AccChgTime")
	private Date accChgTime;

	@Column(name="AccTab7")
	private String accTab7;

	@Column(name="Add1")
	private String add1;

	@Column(name="Add2")
	private String add2;

	@Column(name="Add3")
	private String add3;

	@Column(name="Add4")
	private String add4;

	@Column(name="AdjTradeValues")
	private boolean adjTradeValues;

	@Column(name="AllowAccImport")
	private String allowAccImport;

	@Column(name="AllowCashWithdrawals")
	private String allowCashWithdrawals;

	@Column(name="AllowExercise")
	private String allowExercise;

	@Column(name="AllowGiveUp")
	private String allowGiveUp;

	@Column(name="AllowOnline")
	private String allowOnline;

	@Column(name="AllowResvdCashMovt")
	private String allowResvdCashMovt;

	@Column(name="AllowTakeUp")
	private String allowTakeUp;

	@Column(name="AllowTransferAccept")
	private String allowTransferAccept;

	@Column(name="AllowTransferEntry")
	private String allowTransferEntry;

	@Column(name="BackOfficeFax")
	private String backOfficeFax;

	@Column(name="BackOfficePhone")
	private String backOfficePhone;

	private String BIREODPrinting;

	private String BIRRTReporting;

	@Column(name="BusDate")
	private Date busDate;

	@Column(name="BypassCutOff")
	private String bypassCutOff;

	@Column(name="BypassMsg")
	private String bypassMsg;

	private String CASSummary;

	private short CCCdataLoaded;

	private String CHName;

	private String CMTDepositsLastFile;

	private String CMTDepositsStatus;

	private String CMTWithdrawalsLastFile;

	private String CMTWithdrawalsStatus;

	@Column(name="CommYearEnd")
	private Date commYearEnd;

	@Column(name="ContactBackOffice")
	private String contactBackOffice;

	@Column(name="ContactFinancial")
	private String contactFinancial;

	@Column(name="ContactManagement")
	private String contactManagement;

	@Column(name="ContactTrading")
	private String contactTrading;

	@Column(name="Country")
	private String country;

	@Column(name="CreateAutoPostings")
	private boolean createAutoPostings;

	@Column(name="DaysBackupToKeep")
	private short daysBackupToKeep;

	private String EMail;

	private int EODBackUpDeviceNo;

	private String EODBulkStatus;

	private String EODInitStatus;

	private short EODPhase;

	private int EODProcID;

	private Date EODRunDate;

	private String EODStatus;

	private String EODStatusASX;

	private String EODStatusCFD;

	private String EODStatusSFE;

	@Column(name="ExchRateVar")
	private double exchRateVar;

	@Column(name="ExerCutOff")
	private String exerCutOff;

	@Column(name="ExpiryDays")
	private int expiryDays;

	@Column(name="FinancialYearEnd")
	private Date financialYearEnd;

	@Column(name="GrpChgTime")
	private Date grpChgTime;

	@Column(name="ICN")
	private String icn;

	private BigDecimal LEPOStampDuty;

	@Column(name="LiscencedTo")
	private String liscencedTo;

	@Column(name="MainFax")
	private String mainFax;

	@Column(name="MainPhone")
	private String mainPhone;

	private String MCMSoftVer;

	@Column(name="Name")
	private String name;

	@Column(name="NextBusDate")
	private Date nextBusDate;

	private int OCHSegID;

	private int OCHUnSegID;

	@Column(name="PostCode")
	private String postCode;

	@Column(name="PostIntOn1stBusDay")
	private boolean postIntOn1stBusDay;

	@Column(name="PrevBusDate")
	private Date prevBusDate;

	@Column(name="PreViewEODReports")
	private boolean preViewEODReports;

	@Column(name="PriceDate")
	private Date priceDate;

	@Column(name="PriceValidationLimit")
	private short priceValidationLimit;

	@Column(name="ProcessFlags")
	private String processFlags;

	@Column(name="ProtectPrices")
	private String protectPrices;

	@Column(name="Reconciled")
	private String reconciled;

	@Column(name="RefPriceDate")
	private Date refPriceDate;

	@Column(name="RefPricesInProg")
	private String refPricesInProg;

	@Column(name="RunWebEOD")
	private String runWebEOD;

	@Column(name="ServerPrint")
	private String serverPrint;

	@Column(name="ShutdownReq")
	private String shutdownReq;

	private int SODBackUpDeviceNo;

	@Column(name="SpecificCoverTolerance")
	private BigDecimal specificCoverTolerance;

	@Column(name="StartOfFinancialYear")
	private short startOfFinancialYear;

	@Column(name="State")
	private String state;

	@Column(name="Status")
	private short status;

	@Column(name="SysCHAccID")
	private int sysCHAccID;

	@Column(name="SysCHCur")
	private String sysCHCur;

	@Column(name="SysCur")
	private String sysCur;

	@Column(name="SysNotifyCH")
	private boolean sysNotifyCH;

	@Column(name="TaxSystem")
	private String taxSystem;

	@Column(name="UnplannedHolidayRun")
	private boolean unplannedHolidayRun;

	@Column(name="UpdateCount")
	private int updateCount;

	@Column(name="UpdateNumber")
	@Transient
	private Timestamp updateNumber;

	@Column(name="UseSpan")
	private String useSpan;

	@Column(name="WaitForCCCdata")
	private short waitForCCCdata;

	@Column(name="WebEODProcID")
	private int webEODProcID;

	public Sys() {
	}

	public int getMyMbrId() {
		return this.myMbrId;
	}

	public void setMyMbrId(int myMbrId) {
		this.myMbrId = myMbrId;
	}

	public Date getAccChgTime() {
		return this.accChgTime;
	}

	public void setAccChgTime(Date accChgTime) {
		this.accChgTime = accChgTime;
	}

	public String getAccTab7() {
		return this.accTab7;
	}

	public void setAccTab7(String accTab7) {
		this.accTab7 = accTab7;
	}

	public String getAdd1() {
		return this.add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return this.add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public String getAdd3() {
		return this.add3;
	}

	public void setAdd3(String add3) {
		this.add3 = add3;
	}

	public String getAdd4() {
		return this.add4;
	}

	public void setAdd4(String add4) {
		this.add4 = add4;
	}

	public boolean getAdjTradeValues() {
		return this.adjTradeValues;
	}

	public void setAdjTradeValues(boolean adjTradeValues) {
		this.adjTradeValues = adjTradeValues;
	}

	public String getAllowAccImport() {
		return this.allowAccImport;
	}

	public void setAllowAccImport(String allowAccImport) {
		this.allowAccImport = allowAccImport;
	}

	public String getAllowCashWithdrawals() {
		return this.allowCashWithdrawals;
	}

	public void setAllowCashWithdrawals(String allowCashWithdrawals) {
		this.allowCashWithdrawals = allowCashWithdrawals;
	}

	public String getAllowExercise() {
		return this.allowExercise;
	}

	public void setAllowExercise(String allowExercise) {
		this.allowExercise = allowExercise;
	}

	public String getAllowGiveUp() {
		return this.allowGiveUp;
	}

	public void setAllowGiveUp(String allowGiveUp) {
		this.allowGiveUp = allowGiveUp;
	}

	public String getAllowOnline() {
		return this.allowOnline;
	}

	public void setAllowOnline(String allowOnline) {
		this.allowOnline = allowOnline;
	}

	public String getAllowResvdCashMovt() {
		return this.allowResvdCashMovt;
	}

	public void setAllowResvdCashMovt(String allowResvdCashMovt) {
		this.allowResvdCashMovt = allowResvdCashMovt;
	}

	public String getAllowTakeUp() {
		return this.allowTakeUp;
	}

	public void setAllowTakeUp(String allowTakeUp) {
		this.allowTakeUp = allowTakeUp;
	}

	public String getAllowTransferAccept() {
		return this.allowTransferAccept;
	}

	public void setAllowTransferAccept(String allowTransferAccept) {
		this.allowTransferAccept = allowTransferAccept;
	}

	public String getAllowTransferEntry() {
		return this.allowTransferEntry;
	}

	public void setAllowTransferEntry(String allowTransferEntry) {
		this.allowTransferEntry = allowTransferEntry;
	}

	public String getBackOfficeFax() {
		return this.backOfficeFax;
	}

	public void setBackOfficeFax(String backOfficeFax) {
		this.backOfficeFax = backOfficeFax;
	}

	public String getBackOfficePhone() {
		return this.backOfficePhone;
	}

	public void setBackOfficePhone(String backOfficePhone) {
		this.backOfficePhone = backOfficePhone;
	}

	public String getBIREODPrinting() {
		return this.BIREODPrinting;
	}

	public void setBIREODPrinting(String BIREODPrinting) {
		this.BIREODPrinting = BIREODPrinting;
	}

	public String getBIRRTReporting() {
		return this.BIRRTReporting;
	}

	public void setBIRRTReporting(String BIRRTReporting) {
		this.BIRRTReporting = BIRRTReporting;
	}

	public Date getBusDate() {
		return this.busDate;
	}

	public void setBusDate(Date busDate) {
		this.busDate = busDate;
	}

	public String getBypassCutOff() {
		return this.bypassCutOff;
	}

	public void setBypassCutOff(String bypassCutOff) {
		this.bypassCutOff = bypassCutOff;
	}

	public String getBypassMsg() {
		return this.bypassMsg;
	}

	public void setBypassMsg(String bypassMsg) {
		this.bypassMsg = bypassMsg;
	}

	public String getCASSummary() {
		return this.CASSummary;
	}

	public void setCASSummary(String CASSummary) {
		this.CASSummary = CASSummary;
	}

	public short getCCCdataLoaded() {
		return this.CCCdataLoaded;
	}

	public void setCCCdataLoaded(short CCCdataLoaded) {
		this.CCCdataLoaded = CCCdataLoaded;
	}

	public String getCHName() {
		return this.CHName;
	}

	public void setCHName(String CHName) {
		this.CHName = CHName;
	}

	public String getCMTDepositsLastFile() {
		return this.CMTDepositsLastFile;
	}

	public void setCMTDepositsLastFile(String CMTDepositsLastFile) {
		this.CMTDepositsLastFile = CMTDepositsLastFile;
	}

	public String getCMTDepositsStatus() {
		return this.CMTDepositsStatus;
	}

	public void setCMTDepositsStatus(String CMTDepositsStatus) {
		this.CMTDepositsStatus = CMTDepositsStatus;
	}

	public String getCMTWithdrawalsLastFile() {
		return this.CMTWithdrawalsLastFile;
	}

	public void setCMTWithdrawalsLastFile(String CMTWithdrawalsLastFile) {
		this.CMTWithdrawalsLastFile = CMTWithdrawalsLastFile;
	}

	public String getCMTWithdrawalsStatus() {
		return this.CMTWithdrawalsStatus;
	}

	public void setCMTWithdrawalsStatus(String CMTWithdrawalsStatus) {
		this.CMTWithdrawalsStatus = CMTWithdrawalsStatus;
	}

	public Date getCommYearEnd() {
		return this.commYearEnd;
	}

	public void setCommYearEnd(Date commYearEnd) {
		this.commYearEnd = commYearEnd;
	}

	public String getContactBackOffice() {
		return this.contactBackOffice;
	}

	public void setContactBackOffice(String contactBackOffice) {
		this.contactBackOffice = contactBackOffice;
	}

	public String getContactFinancial() {
		return this.contactFinancial;
	}

	public void setContactFinancial(String contactFinancial) {
		this.contactFinancial = contactFinancial;
	}

	public String getContactManagement() {
		return this.contactManagement;
	}

	public void setContactManagement(String contactManagement) {
		this.contactManagement = contactManagement;
	}

	public String getContactTrading() {
		return this.contactTrading;
	}

	public void setContactTrading(String contactTrading) {
		this.contactTrading = contactTrading;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean getCreateAutoPostings() {
		return this.createAutoPostings;
	}

	public void setCreateAutoPostings(boolean createAutoPostings) {
		this.createAutoPostings = createAutoPostings;
	}

	public short getDaysBackupToKeep() {
		return this.daysBackupToKeep;
	}

	public void setDaysBackupToKeep(short daysBackupToKeep) {
		this.daysBackupToKeep = daysBackupToKeep;
	}

	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	public int getEODBackUpDeviceNo() {
		return this.EODBackUpDeviceNo;
	}

	public void setEODBackUpDeviceNo(int EODBackUpDeviceNo) {
		this.EODBackUpDeviceNo = EODBackUpDeviceNo;
	}

	public String getEODBulkStatus() {
		return this.EODBulkStatus;
	}

	public void setEODBulkStatus(String EODBulkStatus) {
		this.EODBulkStatus = EODBulkStatus;
	}

	public String getEODInitStatus() {
		return this.EODInitStatus;
	}

	public void setEODInitStatus(String EODInitStatus) {
		this.EODInitStatus = EODInitStatus;
	}

	public short getEODPhase() {
		return this.EODPhase;
	}

	public void setEODPhase(short EODPhase) {
		this.EODPhase = EODPhase;
	}

	public int getEODProcID() {
		return this.EODProcID;
	}

	public void setEODProcID(int EODProcID) {
		this.EODProcID = EODProcID;
	}

	public Date getEODRunDate() {
		return this.EODRunDate;
	}

	public void setEODRunDate(Date EODRunDate) {
		this.EODRunDate = EODRunDate;
	}

	public String getEODStatus() {
		return this.EODStatus;
	}

	public void setEODStatus(String EODStatus) {
		this.EODStatus = EODStatus;
	}

	public String getEODStatusASX() {
		return this.EODStatusASX;
	}

	public void setEODStatusASX(String EODStatusASX) {
		this.EODStatusASX = EODStatusASX;
	}

	public String getEODStatusCFD() {
		return this.EODStatusCFD;
	}

	public void setEODStatusCFD(String EODStatusCFD) {
		this.EODStatusCFD = EODStatusCFD;
	}

	public String getEODStatusSFE() {
		return this.EODStatusSFE;
	}

	public void setEODStatusSFE(String EODStatusSFE) {
		this.EODStatusSFE = EODStatusSFE;
	}

	public double getExchRateVar() {
		return this.exchRateVar;
	}

	public void setExchRateVar(double exchRateVar) {
		this.exchRateVar = exchRateVar;
	}

	public String getExerCutOff() {
		return this.exerCutOff;
	}

	public void setExerCutOff(String exerCutOff) {
		this.exerCutOff = exerCutOff;
	}

	public int getExpiryDays() {
		return this.expiryDays;
	}

	public void setExpiryDays(int expiryDays) {
		this.expiryDays = expiryDays;
	}

	public Date getFinancialYearEnd() {
		return this.financialYearEnd;
	}

	public void setFinancialYearEnd(Date financialYearEnd) {
		this.financialYearEnd = financialYearEnd;
	}

	public Date getGrpChgTime() {
		return this.grpChgTime;
	}

	public void setGrpChgTime(Date grpChgTime) {
		this.grpChgTime = grpChgTime;
	}

	public String getIcn() {
		return this.icn;
	}

	public void setIcn(String icn) {
		this.icn = icn;
	}

	public BigDecimal getLEPOStampDuty() {
		return this.LEPOStampDuty;
	}

	public void setLEPOStampDuty(BigDecimal LEPOStampDuty) {
		this.LEPOStampDuty = LEPOStampDuty;
	}

	public String getLiscencedTo() {
		return this.liscencedTo;
	}

	public void setLiscencedTo(String liscencedTo) {
		this.liscencedTo = liscencedTo;
	}

	public String getMainFax() {
		return this.mainFax;
	}

	public void setMainFax(String mainFax) {
		this.mainFax = mainFax;
	}

	public String getMainPhone() {
		return this.mainPhone;
	}

	public void setMainPhone(String mainPhone) {
		this.mainPhone = mainPhone;
	}

	public String getMCMSoftVer() {
		return this.MCMSoftVer;
	}

	public void setMCMSoftVer(String MCMSoftVer) {
		this.MCMSoftVer = MCMSoftVer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNextBusDate() {
		return this.nextBusDate;
	}

	public void setNextBusDate(Date nextBusDate) {
		this.nextBusDate = nextBusDate;
	}

	public int getOCHSegID() {
		return this.OCHSegID;
	}

	public void setOCHSegID(int OCHSegID) {
		this.OCHSegID = OCHSegID;
	}

	public int getOCHUnSegID() {
		return this.OCHUnSegID;
	}

	public void setOCHUnSegID(int OCHUnSegID) {
		this.OCHUnSegID = OCHUnSegID;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public boolean getPostIntOn1stBusDay() {
		return this.postIntOn1stBusDay;
	}

	public void setPostIntOn1stBusDay(boolean postIntOn1stBusDay) {
		this.postIntOn1stBusDay = postIntOn1stBusDay;
	}

	public Date getPrevBusDate() {
		return this.prevBusDate;
	}

	public void setPrevBusDate(Date prevBusDate) {
		this.prevBusDate = prevBusDate;
	}

	public boolean getPreViewEODReports() {
		return this.preViewEODReports;
	}

	public void setPreViewEODReports(boolean preViewEODReports) {
		this.preViewEODReports = preViewEODReports;
	}

	public Date getPriceDate() {
		return this.priceDate;
	}

	public void setPriceDate(Date priceDate) {
		this.priceDate = priceDate;
	}

	public short getPriceValidationLimit() {
		return this.priceValidationLimit;
	}

	public void setPriceValidationLimit(short priceValidationLimit) {
		this.priceValidationLimit = priceValidationLimit;
	}

	public String getProcessFlags() {
		return this.processFlags;
	}

	public void setProcessFlags(String processFlags) {
		this.processFlags = processFlags;
	}

	public String getProtectPrices() {
		return this.protectPrices;
	}

	public void setProtectPrices(String protectPrices) {
		this.protectPrices = protectPrices;
	}

	public String getReconciled() {
		return this.reconciled;
	}

	public void setReconciled(String reconciled) {
		this.reconciled = reconciled;
	}

	public Date getRefPriceDate() {
		return this.refPriceDate;
	}

	public void setRefPriceDate(Date refPriceDate) {
		this.refPriceDate = refPriceDate;
	}

	public String getRefPricesInProg() {
		return this.refPricesInProg;
	}

	public void setRefPricesInProg(String refPricesInProg) {
		this.refPricesInProg = refPricesInProg;
	}

	public String getRunWebEOD() {
		return this.runWebEOD;
	}

	public void setRunWebEOD(String runWebEOD) {
		this.runWebEOD = runWebEOD;
	}

	public String getServerPrint() {
		return this.serverPrint;
	}

	public void setServerPrint(String serverPrint) {
		this.serverPrint = serverPrint;
	}

	public String getShutdownReq() {
		return this.shutdownReq;
	}

	public void setShutdownReq(String shutdownReq) {
		this.shutdownReq = shutdownReq;
	}

	public int getSODBackUpDeviceNo() {
		return this.SODBackUpDeviceNo;
	}

	public void setSODBackUpDeviceNo(int SODBackUpDeviceNo) {
		this.SODBackUpDeviceNo = SODBackUpDeviceNo;
	}

	public BigDecimal getSpecificCoverTolerance() {
		return this.specificCoverTolerance;
	}

	public void setSpecificCoverTolerance(BigDecimal specificCoverTolerance) {
		this.specificCoverTolerance = specificCoverTolerance;
	}

	public short getStartOfFinancialYear() {
		return this.startOfFinancialYear;
	}

	public void setStartOfFinancialYear(short startOfFinancialYear) {
		this.startOfFinancialYear = startOfFinancialYear;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public short getStatus() {
		return this.status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public int getSysCHAccID() {
		return this.sysCHAccID;
	}

	public void setSysCHAccID(int sysCHAccID) {
		this.sysCHAccID = sysCHAccID;
	}

	public String getSysCHCur() {
		return this.sysCHCur;
	}

	public void setSysCHCur(String sysCHCur) {
		this.sysCHCur = sysCHCur;
	}

	public String getSysCur() {
		return this.sysCur;
	}

	public void setSysCur(String sysCur) {
		this.sysCur = sysCur;
	}

	public boolean getSysNotifyCH() {
		return this.sysNotifyCH;
	}

	public void setSysNotifyCH(boolean sysNotifyCH) {
		this.sysNotifyCH = sysNotifyCH;
	}

	public String getTaxSystem() {
		return this.taxSystem;
	}

	public void setTaxSystem(String taxSystem) {
		this.taxSystem = taxSystem;
	}

	public boolean getUnplannedHolidayRun() {
		return this.unplannedHolidayRun;
	}

	public void setUnplannedHolidayRun(boolean unplannedHolidayRun) {
		this.unplannedHolidayRun = unplannedHolidayRun;
	}

	public int getUpdateCount() {
		return this.updateCount;
	}

	public void setUpdateCount(int updateCount) {
		this.updateCount = updateCount;
	}

	public Timestamp getUpdateNumber() {
		return this.updateNumber;
	}

	public void setUpdateNumber(Timestamp updateNumber) {
		this.updateNumber = updateNumber;
	}

	public String getUseSpan() {
		return this.useSpan;
	}

	public void setUseSpan(String useSpan) {
		this.useSpan = useSpan;
	}

	public short getWaitForCCCdata() {
		return this.waitForCCCdata;
	}

	public void setWaitForCCCdata(short waitForCCCdata) {
		this.waitForCCCdata = waitForCCCdata;
	}

	public int getWebEODProcID() {
		return this.webEODProcID;
	}

	public void setWebEODProcID(int webEODProcID) {
		this.webEODProcID = webEODProcID;
	}

}