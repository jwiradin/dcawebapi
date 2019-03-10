package com.gbst.dca.domain.dca;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the RiskProfile database table.
 *
 */
@Entity
@NamedQuery(name="RiskProfile.findAll", query="SELECT r FROM RiskProfile r")
public class RiskProfile implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="RiskProfileID")
    private int riskProfileID;

    @Column(name="MandatoryReferral")
    private String mandatoryReferral;

    @Column(name="MaxMargLimit")
    private BigDecimal maxMargLimit;

    @Column(name="OrderReferralLimit")
    private BigDecimal orderReferralLimit;

    @Column(name="ProfileDesc")
    private String profileDesc;

    @Column(name="ReportingMargLimit")
    private BigDecimal reportingMargLimit;

    @Column(name="UpdateCount")
    private int updateCount;

    @Column(name="UpdateNumber")
    @Transient
    private Timestamp updateNumber;

    public RiskProfile() {
    }

    public int getRiskProfileID() {
        return this.riskProfileID;
    }

    public void setRiskProfileID(int riskProfileID) {
        this.riskProfileID = riskProfileID;
    }

    public String getMandatoryReferral() {
        return this.mandatoryReferral;
    }

    public void setMandatoryReferral(String mandatoryReferral) {
        this.mandatoryReferral = mandatoryReferral;
    }

    public BigDecimal getMaxMargLimit() {
        return this.maxMargLimit;
    }

    public void setMaxMargLimit(BigDecimal maxMargLimit) {
        this.maxMargLimit = maxMargLimit;
    }

    public BigDecimal getOrderReferralLimit() {
        return this.orderReferralLimit;
    }

    public void setOrderReferralLimit(BigDecimal orderReferralLimit) {
        this.orderReferralLimit = orderReferralLimit;
    }

    public String getProfileDesc() {
        return this.profileDesc;
    }

    public void setProfileDesc(String profileDesc) {
        this.profileDesc = profileDesc;
    }

    public BigDecimal getReportingMargLimit() {
        return this.reportingMargLimit;
    }

    public void setReportingMargLimit(BigDecimal reportingMargLimit) {
        this.reportingMargLimit = reportingMargLimit;
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

}