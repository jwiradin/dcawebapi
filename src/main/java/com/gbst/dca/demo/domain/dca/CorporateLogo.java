package com.gbst.dca.demo.domain.dca;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="Corporate")
public class CorporateLogo {

    @Id
    private int corporateID;

    @OneToOne()
    @JoinColumn(name="CorporateID")
    @JsonBackReference
    private Corporate corporate;

    @Lob
    @Column(name="Page1Logo")
    private byte[] page1Logo;

    @Lob
    @Column(name="Page1LogoL")
    private byte[] page1LogoL;

    @Column(name="Page1LogoName")
    private String page1LogoName;

    @Column(name="Page1LogoNameL")
    private String page1LogoNameL;

    @Lob
    @Column(name="Page2Logo")
    private byte[] page2Logo;

    @Lob
    @Column(name="Page2LogoL")
    private byte[] page2LogoL;

    @Column(name="Page2LogoName")
    private String page2LogoName;

    @Column(name="Page2LogoNameL")
    private String page2LogoNameL;

    public int getCorporateID() {
        return this.corporateID;
    }

    public void setCorporateID(int corporateID) {
        this.corporateID = corporateID;
    }

    public byte[] getPage1Logo() {
        return this.page1Logo;
    }

    public void setPage1Logo(byte[] page1Logo) {
        this.page1Logo = page1Logo;
    }

    public byte[] getPage1LogoL() {
        return this.page1LogoL;
    }

    public void setPage1LogoL(byte[] page1LogoL) {
        this.page1LogoL = page1LogoL;
    }

    public String getPage1LogoName() {
        return this.page1LogoName;
    }

    public void setPage1LogoName(String page1LogoName) {
        this.page1LogoName = page1LogoName;
    }

    public String getPage1LogoNameL() {
        return this.page1LogoNameL;
    }

    public void setPage1LogoNameL(String page1LogoNameL) {
        this.page1LogoNameL = page1LogoNameL;
    }

    public byte[] getPage2Logo() {
        return this.page2Logo;
    }

    public void setPage2Logo(byte[] page2Logo) {
        this.page2Logo = page2Logo;
    }

    public byte[] getPage2LogoL() {
        return this.page2LogoL;
    }

    public void setPage2LogoL(byte[] page2LogoL) {
        this.page2LogoL = page2LogoL;
    }

    public String getPage2LogoName() {
        return this.page2LogoName;
    }

    public void setPage2LogoName(String page2LogoName) {
        this.page2LogoName = page2LogoName;
    }

    public String getPage2LogoNameL() {
        return this.page2LogoNameL;
    }

    public void setPage2LogoNameL(String page2LogoNameL) {
        this.page2LogoNameL = page2LogoNameL;
    }

    public Corporate getCorporate() {
        return this.corporate;
    }

    public void setCorporate(Corporate corporate) {
        this.corporate = corporate;
    }
}
