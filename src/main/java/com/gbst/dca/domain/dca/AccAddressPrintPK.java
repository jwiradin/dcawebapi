package com.gbst.dca.domain.dca;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AccAddressPrint database table.
 * 
 */
@Embeddable
public class AccAddressPrintPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="AccID")
	private int accID;

	@Column(name="AddNum")
	private short addNum;

	@Column(name="ReportID")
	private String reportID;

	public AccAddressPrintPK() {
	}

	public AccAddressPrintPK(int accID, short addNum, String reportID) {
		this.accID = accID;
		this.addNum = addNum;
		this.reportID = reportID;
	}

	public int getAccID() {
		return this.accID;
	}
	public void setAccID(int accID) {
		this.accID = accID;
	}
	public short getAddNum() {
		return this.addNum;
	}
	public void setAddNum(short addNum) {
		this.addNum = addNum;
	}
	public String getReportID() {
		return this.reportID;
	}
	public void setReportID(String reportID) {
		this.reportID = reportID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AccAddressPrintPK)) {
			return false;
		}
		AccAddressPrintPK castOther = (AccAddressPrintPK)other;
		return 
			(this.accID == castOther.accID)
			&& (this.addNum == castOther.addNum)
			&& this.reportID.equals(castOther.reportID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.accID;
		hash = hash * prime + ((int) this.addNum);
		hash = hash * prime + this.reportID.hashCode();
		
		return hash;
	}
}