package com.gbst.dca.demo.domain.dca;

import org.hibernate.annotations.DiscriminatorOptions;
import org.hibernate.annotations.Where;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
@Where(clause = "GrpType='A'")
public class Advisor extends Grp {
}
