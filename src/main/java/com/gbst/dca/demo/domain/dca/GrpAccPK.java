package com.gbst.dca.demo.domain.dca;


import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the GrpAcc database table.
 *
 */
@Embeddable
public class GrpAccPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name="AccId")
    private int accId;

    @Column(name="GrpId")
    private int grpId;

    public GrpAccPK() {
    }
    public int getAccId() {
        return this.accId;
    }
    public void setAccId(int accId) {
        this.accId = accId;
    }
    public int getGrpId() {
        return this.grpId;
    }
    public void setGrpId(int grpId) {
        this.grpId = grpId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GrpAccPK)) {
            return false;
        }
        GrpAccPK castOther = (GrpAccPK)other;
        return
                (this.accId == castOther.accId)
                        && (this.grpId == castOther.grpId);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.accId;
        hash = hash * prime + this.grpId;

        return hash;
    }
}