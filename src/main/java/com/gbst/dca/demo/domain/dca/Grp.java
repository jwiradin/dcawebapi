package com.gbst.dca.demo.domain.dca;

import org.hibernate.annotations.DiscriminatorOptions;

import javax.persistence.*;
import java.io.Serializable;
import java.security.Timestamp;

/**
 * The persistent class for the Grp database table.
 *
 */
@Entity
@DiscriminatorColumn(name = "GrpType", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorOptions(force = true)
public class Grp implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="GrpId")
    private int grpId;

    @Column(name="AddressID")
    private int addressID;

    @Column(name="Branch")
    private String branch;

    @Column(name="CreatePDF")
    private String createPDF;

    @Column(name="CurID")
    private int curID;

    @Column(name="DeliveryMethod")
    private String deliveryMethod;

    @Column(name="Email")
    private String email;

    @Column(name="Fax")
    private String fax;

    private String GLCode;

    @Column(name="Grp")
    private String grp;

    @Column(name="GrpName")
    private String grpName;

    @Column(name="GrpType", insertable = false, updatable = false)
    private String grpType;

    @Column(name="SigID")
    private int sigID;

    @Column(name="SuspRptExtract")
    private String suspRptExtract;

    private String TPCode;

    private String TPIdentifier;

    @Column(name="UpdateNumber")
    @Transient
    private Timestamp updateNumber;

    public Grp() {
    }

    public int getGrpId() {
        return this.grpId;
    }

    public void setGrpId(int grpId) {
        this.grpId = grpId;
    }

    public int getAddressID() {
        return this.addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCreatePDF() {
        return this.createPDF;
    }

    public void setCreatePDF(String createPDF) {
        this.createPDF = createPDF;
    }

    public int getCurID() {
        return this.curID;
    }

    public void setCurID(int curID) {
        this.curID = curID;
    }

    public String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getGLCode() {
        return this.GLCode;
    }

    public void setGLCode(String GLCode) {
        this.GLCode = GLCode;
    }

    public String getGrp() {
        return this.grp;
    }

    public void setGrp(String grp) {
        this.grp = grp;
    }

    public String getGrpName() {
        return this.grpName;
    }

    public void setGrpName(String grpName) {
        this.grpName = grpName;
    }

    public String getGrpType() {
        return this.grpType;
    }

    public void setGrpType(String grpType) {
        this.grpType = grpType;
    }

    public int getSigID() {
        return this.sigID;
    }

    public void setSigID(int sigID) {
        this.sigID = sigID;
    }

    public String getSuspRptExtract() {
        return this.suspRptExtract;
    }

    public void setSuspRptExtract(String suspRptExtract) {
        this.suspRptExtract = suspRptExtract;
    }

    public String getTPCode() {
        return this.TPCode;
    }

    public void setTPCode(String TPCode) {
        this.TPCode = TPCode;
    }

    public String getTPIdentifier() {
        return this.TPIdentifier;
    }

    public void setTPIdentifier(String TPIdentifier) {
        this.TPIdentifier = TPIdentifier;
    }

    public Timestamp getUpdateNumber() {
        return this.updateNumber;
    }

    public void setUpdateNumber(Timestamp updateNumber) {
        this.updateNumber = updateNumber;
    }

}