package com.gbst.dca.domain.dca;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Corporate database table.
 *
 */
@Entity
@NamedQuery(name="Corporate.findAll", query="SELECT c FROM Corporate c")
public class Corporate implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="CorporateID")
    private int corporateID;

    @Column(name="CorpName")
    private String corpName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "corporateID")
   // @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private CorporateLogo corporateLogo;

    @OneToMany(mappedBy="corporate", fetch=FetchType.LAZY)
    @JsonBackReference
    private List<Acc> accs;

    public Corporate() {
    }

    public int getCorporateID() {
        return this.corporateID;
    }

    public void setCorporateID(int corporateID) {
        this.corporateID = corporateID;
    }

    public String getCorpName() {
        return this.corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }
/*

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
    */

    public CorporateLogo getCorporateLogo() {
        return corporateLogo;
    }

    public void setCorporateLogo(CorporateLogo corporateLogo) {
        this.corporateLogo = corporateLogo;
    }

    public List<Acc> getAccs() {
        return this.accs;
    }

    public void setAccs(List<Acc> accs) {
        this.accs = accs;
    }
}