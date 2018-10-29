package com.gbst.dca.demo.domain.dca;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the EODReports database table.
 * 
 */
@Entity
@Table(name="EODReports")
@NamedQuery(name="EODReport.findAll", query="SELECT e FROM EODReport e")
public class EODReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RepID")
	private String repID;

	@Column(name="Archive")
	private boolean archive;

	@Column(name="ArchiveFrequency")
	private String archiveFrequency;

	private int BIR_RepID_Acc;

	private int BIR_RepID_ALL;

	private int BIR_RepID_Corp;

	private int BIR_RepID_Grp;

	private String birStoredProc;

	private String birURI;

	@Column(name="`Collate`")
	private boolean collate;

	@Column(name="Copies")
	private short copies;

	@Column(name="DispSeq")
	private short dispSeq;

	@Column(name="HideReport")
	private boolean hideReport;

	@Column(name="InstanceID")
	private int instanceID;

	@Column(name="IsLandscape")
	private String isLandscape;

	private String PDFPrinterName;

	@Column(name="PrintFrequency")
	private String printFrequency;

	@Column(name="PrtOrder")
	private short prtOrder;

	@Column(name="PrtRep")
	private boolean prtRep;

	@Column(name="RepDesc")
	private String repDesc;

	@Column(name="RepOrigin")
	private String repOrigin;

	@Column(name="ReportFileName")
	private String reportFileName;

	@Column(name="ReportID")
	private String reportID;

	@Column(name="ReportModule")
	private String reportModule;

	@Column(name="ReportType")
	private short reportType;

	@Column(name="RunTonight")
	private short runTonight;

	@Column(name="UpdateCount")
	private int updateCount;

	@Column(name="YestRunTonight")
	private short yestRunTonight;

	//bi-directional many-to-one association to AccAddressPrint
	//@OneToMany(mappedBy="eodreport", fetch=FetchType.EAGER)
	//@JsonBackReference
	//private List<AccAddressPrint> accAddressPrints;

	public EODReport() {
	}

	public String getRepID() {
		return this.repID;
	}

	public void setRepID(String repID) {
		this.repID = repID;
	}

	public boolean getArchive() {
		return this.archive;
	}

	public void setArchive(boolean archive) {
		this.archive = archive;
	}

	public String getArchiveFrequency() {
		return this.archiveFrequency;
	}

	public void setArchiveFrequency(String archiveFrequency) {
		this.archiveFrequency = archiveFrequency;
	}

	public int getBIR_RepID_Acc() {
		return this.BIR_RepID_Acc;
	}

	public void setBIR_RepID_Acc(int BIR_RepID_Acc) {
		this.BIR_RepID_Acc = BIR_RepID_Acc;
	}

	public int getBIR_RepID_ALL() {
		return this.BIR_RepID_ALL;
	}

	public void setBIR_RepID_ALL(int BIR_RepID_ALL) {
		this.BIR_RepID_ALL = BIR_RepID_ALL;
	}

	public int getBIR_RepID_Corp() {
		return this.BIR_RepID_Corp;
	}

	public void setBIR_RepID_Corp(int BIR_RepID_Corp) {
		this.BIR_RepID_Corp = BIR_RepID_Corp;
	}

	public int getBIR_RepID_Grp() {
		return this.BIR_RepID_Grp;
	}

	public void setBIR_RepID_Grp(int BIR_RepID_Grp) {
		this.BIR_RepID_Grp = BIR_RepID_Grp;
	}

	public String getBirStoredProc() {
		return this.birStoredProc;
	}

	public void setBirStoredProc(String birStoredProc) {
		this.birStoredProc = birStoredProc;
	}

	public String getBirURI() {
		return this.birURI;
	}

	public void setBirURI(String birURI) {
		this.birURI = birURI;
	}

	public boolean getCollate() {
		return this.collate;
	}

	public void setCollate(boolean collate) {
		this.collate = collate;
	}

	public short getCopies() {
		return this.copies;
	}

	public void setCopies(short copies) {
		this.copies = copies;
	}

	public short getDispSeq() {
		return this.dispSeq;
	}

	public void setDispSeq(short dispSeq) {
		this.dispSeq = dispSeq;
	}

	public boolean getHideReport() {
		return this.hideReport;
	}

	public void setHideReport(boolean hideReport) {
		this.hideReport = hideReport;
	}

	public int getInstanceID() {
		return this.instanceID;
	}

	public void setInstanceID(int instanceID) {
		this.instanceID = instanceID;
	}

	public String getIsLandscape() {
		return this.isLandscape;
	}

	public void setIsLandscape(String isLandscape) {
		this.isLandscape = isLandscape;
	}

	public String getPDFPrinterName() {
		return this.PDFPrinterName;
	}

	public void setPDFPrinterName(String PDFPrinterName) {
		this.PDFPrinterName = PDFPrinterName;
	}

	public String getPrintFrequency() {
		return this.printFrequency;
	}

	public void setPrintFrequency(String printFrequency) {
		this.printFrequency = printFrequency;
	}

	public short getPrtOrder() {
		return this.prtOrder;
	}

	public void setPrtOrder(short prtOrder) {
		this.prtOrder = prtOrder;
	}

	public boolean getPrtRep() {
		return this.prtRep;
	}

	public void setPrtRep(boolean prtRep) {
		this.prtRep = prtRep;
	}

	public String getRepDesc() {
		return this.repDesc;
	}

	public void setRepDesc(String repDesc) {
		this.repDesc = repDesc;
	}

	public String getRepOrigin() {
		return this.repOrigin;
	}

	public void setRepOrigin(String repOrigin) {
		this.repOrigin = repOrigin;
	}

	public String getReportFileName() {
		return this.reportFileName;
	}

	public void setReportFileName(String reportFileName) {
		this.reportFileName = reportFileName;
	}

	public String getReportID() {
		return this.reportID;
	}

	public void setReportID(String reportID) {
		this.reportID = reportID;
	}

	public String getReportModule() {
		return this.reportModule;
	}

	public void setReportModule(String reportModule) {
		this.reportModule = reportModule;
	}

	public short getReportType() {
		return this.reportType;
	}

	public void setReportType(short reportType) {
		this.reportType = reportType;
	}

	public short getRunTonight() {
		return this.runTonight;
	}

	public void setRunTonight(short runTonight) {
		this.runTonight = runTonight;
	}

	public int getUpdateCount() {
		return this.updateCount;
	}

	public void setUpdateCount(int updateCount) {
		this.updateCount = updateCount;
	}

	public short getYestRunTonight() {
		return this.yestRunTonight;
	}

	public void setYestRunTonight(short yestRunTonight) {
		this.yestRunTonight = yestRunTonight;
	}
/*
	public List<AccAddressPrint> getAccAddressPrints() {
		return this.accAddressPrints;
	}

	public void setAccAddressPrints(List<AccAddressPrint> accAddressPrints) {
		this.accAddressPrints = accAddressPrints;
	}

	public AccAddressPrint addAccAddressPrint(AccAddressPrint accAddressPrint) {
		getAccAddressPrints().add(accAddressPrint);
		accAddressPrint.setEodreport(this);

		return accAddressPrint;
	}

	public AccAddressPrint removeAccAddressPrint(AccAddressPrint accAddressPrint) {
		getAccAddressPrints().remove(accAddressPrint);
		accAddressPrint.setEodreport(null);

		return accAddressPrint;
	}
*/
}