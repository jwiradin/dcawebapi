package com.gbst.dca.demo.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the t_collehld database table.
 *
 */
public class CollHeld implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CollDetail")
	private String collDetail;

	@Column(name="CollType")
	private String collType;

	@Column(name="CollValue")
	private BigDecimal collValue;

	@Column(name="CoverGrp")
	private String coverGrp;

	@Column(name="ExpiryDate")
	private Timestamp expiryDate;

	@Column(name="HIN")
	private String hin;

	@Column(name="Holder")
	private String holder;

	@Column(name="LodgeDate")
	private Timestamp lodgeDate;

	@Column(name="LodgeID")
	private String lodgeID;

	@Column(name="Specific")
	private String specific;

	@Column(name="UnitCode")
	private String unitCode;

	@Column(name="Units")
	private BigDecimal units;

	public CollHeld() {
	}

	public String getCollDetail() {
		return this.collDetail;
	}

	public void setCollDetail(String collDetail) {
		this.collDetail = collDetail;
	}

	public String getCollType() {
		return this.collType;
	}

	public void setCollType(String collType) {
		this.collType = collType;
	}

	public BigDecimal getCollValue() {
		return this.collValue;
	}

	public void setCollValue(BigDecimal collValue) {
		this.collValue = collValue;
	}

	public String getCoverGrp() {
		return this.coverGrp;
	}

	public void setCoverGrp(String coverGrp) {
		this.coverGrp = coverGrp;
	}

	public Timestamp getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getHin() {
		return this.hin;
	}

	public void setHin(String hin) {
		this.hin = hin;
	}

	public String getHolder() {
		return this.holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Timestamp getLodgeDate() {
		return this.lodgeDate;
	}

	public void setLodgeDate(Timestamp lodgeDate) {
		this.lodgeDate = lodgeDate;
	}

	public String getLodgeID() {
		return this.lodgeID;
	}

	public void setLodgeID(String lodgeID) {
		this.lodgeID = lodgeID;
	}

	public String getSpecific() {
		return this.specific;
	}

	public void setSpecific(String specific) {
		this.specific = specific;
	}

	public String getUnitCode() {
		return this.unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public BigDecimal getUnits() {
		return this.units;
	}

	public void setUnits(BigDecimal units) {
		this.units = units;
	}

}