package com.gbst.dca.demo.dto;

import java.io.Serializable;
		import javax.persistence.*;
		import java.math.BigDecimal;
		import java.sql.Timestamp;

public class LedgerActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AccID")
	private int accID;

	@Column(name="AggregateKey")
	private int aggregateKey;

	@Column(name="Amt")
	private BigDecimal amt;

	@Column(name="AmtSumCR")
	private BigDecimal amtSumCR;

	@Column(name="AmtSumDR")
	private BigDecimal amtSumDR;

	@Column(name="CollValue")
	private BigDecimal collValue;

	@Column(name="Cur")
	private String cur;

	@Column(name="CurID")
	private int curID;

	@Column(name="Decimals")
	private short decimals;

	@Column(name="Descript")
	private String descript;

	@Column(name="IM")
	private BigDecimal im;

	@Column(name="LedgerBalance")
	private BigDecimal ledgerBalance;

	@Column(name="LedgerID")
	private int ledgerID;

	@Column(name="NetBalance")
	private BigDecimal netBalance;

	@Column(name="PostCodeID")
	private int postCodeID;

	@Column(name="PostDesc")
	private String postDesc;

	@Column(name="PostingDate")
	private Timestamp postingDate;

	@Column(name="PostingID")
	private int postingID;

	@Column(name="PostSeq")
	private int postSeq;

	@Column(name="RecID")
	private int recID;

	@Column(name="ReservedCash")
	private BigDecimal reservedCash;

	public LedgerActivity() {
	}

	public int getAccID() {
		return this.accID;
	}

	public void setAccID(int accID) {
		this.accID = accID;
	}

	public int getAggregateKey() {
		return this.aggregateKey;
	}

	public void setAggregateKey(int aggregateKey) {
		this.aggregateKey = aggregateKey;
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getAmtSumCR() {
		return this.amtSumCR;
	}

	public void setAmtSumCR(BigDecimal amtSumCR) {
		this.amtSumCR = amtSumCR;
	}

	public BigDecimal getAmtSumDR() {
		return this.amtSumDR;
	}

	public void setAmtSumDR(BigDecimal amtSumDR) {
		this.amtSumDR = amtSumDR;
	}

	public BigDecimal getCollValue() {
		return this.collValue;
	}

	public void setCollValue(BigDecimal collValue) {
		this.collValue = collValue;
	}

	public String getCur() {
		return this.cur;
	}

	public void setCur(String cur) {
		this.cur = cur;
	}

	public int getCurID() {
		return this.curID;
	}

	public void setCurID(int curID) {
		this.curID = curID;
	}

	public short getDecimals() {
		return this.decimals;
	}

	public void setDecimals(short decimals) {
		this.decimals = decimals;
	}

	public String getDescript() {
		return this.descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public BigDecimal getIm() {
		return this.im;
	}

	public void setIm(BigDecimal im) {
		this.im = im;
	}

	public BigDecimal getLedgerBalance() {
		return this.ledgerBalance;
	}

	public void setLedgerBalance(BigDecimal ledgerBalance) {
		this.ledgerBalance = ledgerBalance;
	}

	public int getLedgerID() {
		return this.ledgerID;
	}

	public void setLedgerID(int ledgerID) {
		this.ledgerID = ledgerID;
	}

	public BigDecimal getNetBalance() {
		return this.netBalance;
	}

	public void setNetBalance(BigDecimal netBalance) {
		this.netBalance = netBalance;
	}

	public int getPostCodeID() {
		return this.postCodeID;
	}

	public void setPostCodeID(int postCodeID) {
		this.postCodeID = postCodeID;
	}

	public String getPostDesc() {
		return this.postDesc;
	}

	public void setPostDesc(String postDesc) {
		this.postDesc = postDesc;
	}

	public Timestamp getPostingDate() {
		return this.postingDate;
	}

	public void setPostingDate(Timestamp postingDate) {
		this.postingDate = postingDate;
	}

	public int getPostingID() {
		return this.postingID;
	}

	public void setPostingID(int postingID) {
		this.postingID = postingID;
	}

	public int getPostSeq() {
		return this.postSeq;
	}

	public void setPostSeq(int postSeq) {
		this.postSeq = postSeq;
	}

	public int getRecID() {
		return this.recID;
	}

	public void setRecID(int recID) {
		this.recID = recID;
	}

	public BigDecimal getReservedCash() {
		return this.reservedCash;
	}

	public void setReservedCash(BigDecimal reservedCash) {
		this.reservedCash = reservedCash;
	}

}