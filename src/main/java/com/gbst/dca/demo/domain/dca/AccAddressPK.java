package com.gbst.dca.demo.domain.dca;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AccAddress database table.
 * 
 */
@Embeddable
public class AccAddressPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="AccID")
	private int accID;

	@Column(name="AddNum")
	private short addNum;

	public AccAddressPK() {
	}

	public AccAddressPK(int accID, short addNum) {
		this.accID = accID;
		this.addNum = addNum;
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AccAddressPK)) {
			return false;
		}
		AccAddressPK castOther = (AccAddressPK)other;
		return 
			(this.accID == castOther.accID)
			&& (this.addNum == castOther.addNum);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.accID;
		hash = hash * prime + ((int) this.addNum);
		
		return hash;
	}
}