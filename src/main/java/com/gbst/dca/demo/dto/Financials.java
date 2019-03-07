package com.gbst.dca.demo.dto;


import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


public class Financials implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BfwdCash")
	private BigDecimal bfwdCash;

	@Column(name="Cash")
	private BigDecimal cash;

	@Column(name="CashMargin")
	private BigDecimal cashMargin;

	@Column(name="CashMarginMove")
	private BigDecimal cashMarginMove;

	private BigDecimal CMTBal;

	@Column(name="CollUtil")
	private BigDecimal collUtil;

	@Column(name="CollValue")
	private BigDecimal collValue;

	@Column(name="CoverGrp")
	private String coverGrp;

	@Column(name="Cur")
	private String cur;

	@Column(name="Decimals")
	private int decimals;

	@Column(name="HasCMTBal")
	private String hasCMTBal;

	@Column(name="IM")
	private BigDecimal im;

	@Column(name="NetBalance")
	private BigDecimal netBalance;

	@Column(name="ReservedCash")
	private BigDecimal reservedCash;

	@Column(name="SysPostings")
	private BigDecimal sysPostings;

	@Column(name="UserPostings")
	private BigDecimal userPostings;

	public Financials() {
	}

	public BigDecimal getBfwdCash() {
		return this.bfwdCash;
	}

	public void setBfwdCash(BigDecimal bfwdCash) {
		this.bfwdCash = bfwdCash;
	}

	public BigDecimal getCash() {
		return this.cash;
	}

	public void setCash(BigDecimal cash) {
		this.cash = cash;
	}

	public BigDecimal getCashMargin() {
		return this.cashMargin;
	}

	public void setCashMargin(BigDecimal cashMargin) {
		this.cashMargin = cashMargin;
	}

	public BigDecimal getCashMarginMove() {
		return this.cashMarginMove;
	}

	public void setCashMarginMove(BigDecimal cashMarginMove) {
		this.cashMarginMove = cashMarginMove;
	}

	public BigDecimal getCMTBal() {
		return this.CMTBal;
	}

	public void setCMTBal(BigDecimal CMTBal) {
		this.CMTBal = CMTBal;
	}

	public BigDecimal getCollUtil() {
		return this.collUtil;
	}

	public void setCollUtil(BigDecimal collUtil) {
		this.collUtil = collUtil;
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

	public String getCur() {
		return this.cur;
	}

	public void setCur(String cur) {
		this.cur = cur;
	}

	public int getDecimals() {
		return this.decimals;
	}

	public void setDecimals(int decimals) {
		this.decimals = decimals;
	}

	public String getHasCMTBal() {
		return this.hasCMTBal;
	}

	public void setHasCMTBal(String hasCMTBal) {
		this.hasCMTBal = hasCMTBal;
	}

	public BigDecimal getIm() {
		return this.im;
	}

	public void setIm(BigDecimal im) {
		this.im = im;
	}

	public BigDecimal getNetBalance() {
		return this.netBalance;
	}

	public void setNetBalance(BigDecimal netBalance) {
		this.netBalance = netBalance;
	}

	public BigDecimal getReservedCash() {
		return this.reservedCash;
	}

	public void setReservedCash(BigDecimal reservedCash) {
		this.reservedCash = reservedCash;
	}

	public BigDecimal getSysPostings() {
		return this.sysPostings;
	}

	public void setSysPostings(BigDecimal sysPostings) {
		this.sysPostings = sysPostings;
	}

	public BigDecimal getUserPostings() {
		return this.userPostings;
	}

	public void setUserPostings(BigDecimal userPostings) {
		this.userPostings = userPostings;
	}

}