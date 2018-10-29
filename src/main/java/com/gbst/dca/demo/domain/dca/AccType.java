package com.gbst.dca.demo.domain.dca;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the AccType database table.
 *
 */
@Entity
@NamedQuery(name="AccType.findAll", query="SELECT a FROM AccType a")
public class AccType implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="AccTypeID")
    private int accTypeID;

    @Column(name="AccType")
    private String accType;

    @Column(name="BusCentre")
    private String busCentre;

    private String CHAccType;

    @Column(name="CostCentre")
    private String costCentre;

    @Column(name="Entity")
    private String entity;

    @Column(name="Segregated")
    private boolean segregated;

    @Column(name="Sequence")
    private short sequence;

    @Column(name="UpdateCount")
    private int updateCount;

    @Column(name="UpdateNumber")
    @Transient
    private Timestamp updateNumber;

    public AccType() {
    }

    public int getAccTypeID() {
        return this.accTypeID;
    }

    public void setAccTypeID(int accTypeID) {
        this.accTypeID = accTypeID;
    }

    public String getAccType() {
        return this.accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getBusCentre() {
        return this.busCentre;
    }

    public void setBusCentre(String busCentre) {
        this.busCentre = busCentre;
    }

    public String getCHAccType() {
        return this.CHAccType;
    }

    public void setCHAccType(String CHAccType) {
        this.CHAccType = CHAccType;
    }

    public String getCostCentre() {
        return this.costCentre;
    }

    public void setCostCentre(String costCentre) {
        this.costCentre = costCentre;
    }

    public String getEntity() {
        return this.entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public boolean getSegregated() {
        return this.segregated;
    }

    public void setSegregated(boolean segregated) {
        this.segregated = segregated;
    }

    public short getSequence() {
        return this.sequence;
    }

    public void setSequence(short sequence) {
        this.sequence = sequence;
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