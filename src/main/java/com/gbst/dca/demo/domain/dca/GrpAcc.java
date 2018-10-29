package com.gbst.dca.demo.domain.dca;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the GrpAcc database table.
 *
 */
@Entity
@NamedQuery(name="GrpAcc.findAll", query="SELECT g FROM GrpAcc g")
public class GrpAcc implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private GrpAccPK id;

    @Column(name="UpdateNumber")
    @Transient
    private Timestamp updateNumber;

    public GrpAcc() {
    }

    public GrpAccPK getId() {
        return this.id;
    }

    public void setId(GrpAccPK id) {
        this.id = id;
    }

    public Timestamp getUpdateNumber() {
        return this.updateNumber;
    }

    public void setUpdateNumber(Timestamp updateNumber) {
        this.updateNumber = updateNumber;
    }

}