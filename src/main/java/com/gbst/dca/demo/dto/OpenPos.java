package com.gbst.dca.demo.dto;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class OpenPos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AccID")
	private int accID;

	@Column(name="BuySell")
	private String buySell;

	@Column(name="Clearer")
	private String clearer;

	@Column(name="CurrQty")
	private int currQty;

	@Column(name="DelMonth")
	private Timestamp delMonth;

	@Column(name="DelMonthText")
	private String delMonthText;

	@Column(name="DerivProd")
	private String derivProd;

	@Column(name="EntityShortcut")
	private String entityShortcut;

	@Column(name="ExerStyle")
	private String exerStyle;

	@Column(name="ExpDate")
	private Timestamp expDate;

	@Column(name="MarketValue")
	private BigDecimal marketValue;

	@Column(name="OptType")
	private String optType;

	@Column(name="PosnID")
	private int posnID;

	@Column(name="PriceText")
	private String priceText;

	@Column(name="Reference")
	private String reference;

	@Column(name="Strike")
	private int strike;

	@Column(name="StrikeText")
	private String strikeText;

	@Column(name="TradeDate")
	private Timestamp tradeDate;

	@Column(name="TradedPrice")
	private int tradedPrice;

	@Column(name="TradedPriceTxt")
	private String tradedPriceTxt;

	@Column(name="TradedValue")
	private BigDecimal tradedValue;

	@Column(name="UnrealisedPL")
	private BigDecimal unrealisedPL;

	@Column(name="VersionText")
	private String versionText;

	public OpenPos() {
	}

	public int getAccID() {
		return this.accID;
	}

	public void setAccID(int accID) {
		this.accID = accID;
	}

	public String getBuySell() {
		return this.buySell;
	}

	public void setBuySell(String buySell) {
		this.buySell = buySell;
	}

	public String getClearer() {
		return this.clearer;
	}

	public void setClearer(String clearer) {
		this.clearer = clearer;
	}

	public int getCurrQty() {
		return this.currQty;
	}

	public void setCurrQty(int currQty) {
		this.currQty = currQty;
	}

	public Timestamp getDelMonth() {
		return this.delMonth;
	}

	public void setDelMonth(Timestamp delMonth) {
		this.delMonth = delMonth;
	}

	public String getDelMonthText() {
		return this.delMonthText;
	}

	public void setDelMonthText(String delMonthText) {
		this.delMonthText = delMonthText;
	}

	public String getDerivProd() {
		return this.derivProd;
	}

	public void setDerivProd(String derivProd) {
		this.derivProd = derivProd;
	}

	public String getEntityShortcut() {
		return this.entityShortcut;
	}

	public void setEntityShortcut(String entityShortcut) {
		this.entityShortcut = entityShortcut;
	}

	public String getExerStyle() {
		return this.exerStyle;
	}

	public void setExerStyle(String exerStyle) {
		this.exerStyle = exerStyle;
	}

	public Timestamp getExpDate() {
		return this.expDate;
	}

	public void setExpDate(Timestamp expDate) {
		this.expDate = expDate;
	}

	public BigDecimal getMarketValue() {
		return this.marketValue;
	}

	public void setMarketValue(BigDecimal marketValue) {
		this.marketValue = marketValue;
	}

	public String getOptType() {
		return this.optType;
	}

	public void setOptType(String optType) {
		this.optType = optType;
	}

	public int getPosnID() {
		return this.posnID;
	}

	public void setPosnID(int posnID) {
		this.posnID = posnID;
	}

	public String getPriceText() {
		return this.priceText;
	}

	public void setPriceText(String priceText) {
		this.priceText = priceText;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getStrike() {
		return this.strike;
	}

	public void setStrike(int strike) {
		this.strike = strike;
	}

	public String getStrikeText() {
		return this.strikeText;
	}

	public void setStrikeText(String strikeText) {
		this.strikeText = strikeText;
	}

	public Timestamp getTradeDate() {
		return this.tradeDate;
	}

	public void setTradeDate(Timestamp tradeDate) {
		this.tradeDate = tradeDate;
	}

	public int getTradedPrice() {
		return this.tradedPrice;
	}

	public void setTradedPrice(int tradedPrice) {
		this.tradedPrice = tradedPrice;
	}

	public String getTradedPriceTxt() {
		return this.tradedPriceTxt;
	}

	public void setTradedPriceTxt(String tradedPriceTxt) {
		this.tradedPriceTxt = tradedPriceTxt;
	}

	public BigDecimal getTradedValue() {
		return this.tradedValue;
	}

	public void setTradedValue(BigDecimal tradedValue) {
		this.tradedValue = tradedValue;
	}

	public BigDecimal getUnrealisedPL() {
		return this.unrealisedPL;
	}

	public void setUnrealisedPL(BigDecimal unrealisedPL) {
		this.unrealisedPL = unrealisedPL;
	}

	public String getVersionText() {
		return this.versionText;
	}

	public void setVersionText(String versionText) {
		this.versionText = versionText;
	}

}