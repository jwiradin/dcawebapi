package com.gbst.dca.demo.domain.dca;


import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Cur database table.
 *
 */
@Entity
@NamedQuery(name="Cur.findAll", query="SELECT c FROM Cur c")
public class Cur implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="CurID")
    private int curID;

    private String CHCur;

    @Column(name="Cur")
    private String cur;

    @Column(name="CurDesc")
    private String curDesc;

    @Column(name="CurSeq")
    private short curSeq;

    @Column(name="Decimals")
    private short decimals;

    @Column(name="IntDays")
    private short intDays;

    @Column(name="UpdateNumber")
    @Transient
    private Timestamp updateNumber;

    public Cur() {
    }

    public int getCurID() {
        return this.curID;
    }

    public void setCurID(int curID) {
        this.curID = curID;
    }

    public String getCHCur() {
        return this.CHCur;
    }

    public void setCHCur(String CHCur) {
        this.CHCur = CHCur;
    }

    public String getCur() {
        return this.cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public String getCurDesc() {
        return this.curDesc;
    }

    public void setCurDesc(String curDesc) {
        this.curDesc = curDesc;
    }

    public short getCurSeq() {
        return this.curSeq;
    }

    public void setCurSeq(short curSeq) {
        this.curSeq = curSeq;
    }

    public short getDecimals() {
        return this.decimals;
    }

    public void setDecimals(short decimals) {
        this.decimals = decimals;
    }

    public short getIntDays() {
        return this.intDays;
    }

    public void setIntDays(short intDays) {
        this.intDays = intDays;
    }

    public Timestamp getUpdateNumber() {
        return this.updateNumber;
    }

    public void setUpdateNumber(Timestamp updateNumber) {
        this.updateNumber = updateNumber;
    }

}