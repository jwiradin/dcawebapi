package com.gbst.dca.domain.dca;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the AccAddress database table.
 * 
 */
@Entity
@NamedQuery(name="AccAddress.findAll", query="SELECT a FROM AccAddress a")
public class AccAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AccAddressPK id;

	@Column(name="Add_1")
	private String add_1;

	@Column(name="Add_2")
	private String add_2;

	@Column(name="Add_3")
	private String add_3;

	@Column(name="Add_4")
	private String add_4;

	@Column(name="Add_5")
	private String add_5;

	@Column(name="AddCode")
	private String addCode;

	@Column(name="AddName")
	private String addName;

	@Column(name="CancelPrint")
	private String cancelPrint;

	@Column(name="Country")
	private String country;

	@Column(name="CreatePDF")
	private String createPDF;

	@Column(name="DeliveryMethod")
	private String deliveryMethod;

	@Column(name="DelMethod")
	private String delMethod;

	private String EMail;

	@Column(name="Fax")
	private String fax;

	@Column(name="PostCode")
	private String postCode;

	@Column(name="State")
	private String state;

	@Column(name="SuspRptExtract")
	private String suspRptExtract;

	@Column(name="Tel")
	private String tel;

	@Column(name="UpdateCount")
	private short updateCount;

	@Column(name="UpdateNumber")
	@Transient
	private Timestamp updateNumber;

	//bi-directional many-to-one association to Acc
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="AccID", insertable = false, updatable = false)
	@JsonIgnore
	private Acc acc;

	//bi-directional many-to-one association to AccAddressPrint
	@OneToMany(mappedBy="accAddress", fetch=FetchType.LAZY)
	@JsonManagedReference
	@Fetch(FetchMode.SELECT)
	private List<AccAddressPrint> accAddressPrints;

	public AccAddress() {
	}

	public AccAddressPK getId() {
		return this.id;
	}

	public void setId(AccAddressPK id) {
		this.id = id;
	}

	public String getAdd_1() {
		return this.add_1;
	}

	public void setAdd_1(String add_1) {
		this.add_1 = add_1;
	}

	public String getAdd_2() {
		return this.add_2;
	}

	public void setAdd_2(String add_2) {
		this.add_2 = add_2;
	}

	public String getAdd_3() {
		return this.add_3;
	}

	public void setAdd_3(String add_3) {
		this.add_3 = add_3;
	}

	public String getAdd_4() {
		return this.add_4;
	}

	public void setAdd_4(String add_4) {
		this.add_4 = add_4;
	}

	public String getAdd_5() {
		return this.add_5;
	}

	public void setAdd_5(String add_5) {
		this.add_5 = add_5;
	}

	public String getAddCode() {
		return this.addCode;
	}

	public void setAddCode(String addCode) {
		this.addCode = addCode;
	}

	public String getAddName() {
		return this.addName;
	}

	public void setAddName(String addName) {
		this.addName = addName;
	}

	public String getCancelPrint() {
		return this.cancelPrint;
	}

	public void setCancelPrint(String cancelPrint) {
		this.cancelPrint = cancelPrint;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCreatePDF() {
		return this.createPDF;
	}

	public void setCreatePDF(String createPDF) {
		this.createPDF = createPDF;
	}

	public String getDeliveryMethod() {
		return this.deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public String getDelMethod() {
		return this.delMethod;
	}

	public void setDelMethod(String delMethod) {
		this.delMethod = delMethod;
	}

	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSuspRptExtract() {
		return this.suspRptExtract;
	}

	public void setSuspRptExtract(String suspRptExtract) {
		this.suspRptExtract = suspRptExtract;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public short getUpdateCount() {
		return this.updateCount;
	}

	public void setUpdateCount(short updateCount) {
		this.updateCount = updateCount;
	}

	public Timestamp getUpdateNumber() {
		return this.updateNumber;
	}

	public void setUpdateNumber(Timestamp updateNumber) {
		this.updateNumber = updateNumber;
	}

	public Acc getAcc() {
		return this.acc;
	}

	public void setAcc(Acc acc) {
		this.acc = acc;
	}

	public List<AccAddressPrint> getAccAddressPrints() {
		return this.accAddressPrints;
	}

	public void setAccAddressPrints(List<AccAddressPrint> accAddressPrints) {
		this.accAddressPrints = accAddressPrints;
	}

	public AccAddressPrint addAccAddressPrint(AccAddressPrint accAddressPrint) {
		getAccAddressPrints().add(accAddressPrint);
		accAddressPrint.setAccAddress(this);

		return accAddressPrint;
	}

	public AccAddressPrint removeAccAddressPrint(AccAddressPrint accAddressPrint) {
		getAccAddressPrints().remove(accAddressPrint);
		accAddressPrint.setAccAddress(null);

		return accAddressPrint;
	}

}