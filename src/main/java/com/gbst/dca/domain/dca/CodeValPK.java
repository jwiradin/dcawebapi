package com.gbst.dca.domain.dca;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CodeValPK  implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name="CodeType")
    private String codeType;

    @Column(name="CodeVal")
    private String codeVal;

    public CodeValPK(){

    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getCodeVal() {
        return codeVal;
    }

    public void setCodeVal(String codeVal) {
        this.codeVal = codeVal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CodeValPK codeValPK = (CodeValPK) o;

        if (codeType != null ? !codeType.equals(codeValPK.codeType) : codeValPK.codeType != null) return false;
        return codeVal != null ? codeVal.equals(codeValPK.codeVal) : codeValPK.codeVal == null;
    }

    @Override
    public int hashCode() {
        int result = codeType != null ? codeType.hashCode() : 0;
        result = 31 * result + (codeVal != null ? codeVal.hashCode() : 0);
        return result;
    }
}
