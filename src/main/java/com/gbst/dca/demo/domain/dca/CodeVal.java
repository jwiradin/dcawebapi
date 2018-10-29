package com.gbst.dca.demo.domain.dca;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@NamedQuery(name="CodeVal.findAll", query="SELECT a FROM CodeVal a")
public class CodeVal {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private CodeValPK id;

    @Column(name="CodeDesc")
    private String codeDesc;

    @Column(name="CodeSeq")
    private Integer codeSeq;

    public CodeValPK getId() {
        return id;
    }

    public void setId(CodeValPK id) {
        this.id = id;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }

    public Integer getCodeSeq() {
        return codeSeq;
    }

    public void setCodeSeq(Integer codeSeq) {
        this.codeSeq = codeSeq;
    }
}

