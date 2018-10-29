package com.gbst.dca.demo.domain.dca;

import org.hibernate.annotations.DiscriminatorOptions;
import org.hibernate.annotations.Where;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
@Where(clause = "GrpType='C'")
public class Associated extends Grp {
}
