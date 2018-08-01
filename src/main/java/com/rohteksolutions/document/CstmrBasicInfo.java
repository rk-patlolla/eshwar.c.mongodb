package com.rohteksolutions.document;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cstmrBasicInfo")
public class CstmrBasicInfo implements Serializable {
	
	@Id
	private ObjectId cstmrId;
	
	private String fName;
	
	private String lName;
	
	private String mName;
	
	private String cNo;
	
	private String email;
	
	private String addr;
	
	private String emrgncyCNo;

	private List<CstmrDocs> cstmrDocs;

	public CstmrBasicInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CstmrBasicInfo(ObjectId cstmrId, String fName, String lName, String mName, String cNo, String email,
			String addr, String emrgncyCNo, List<CstmrDocs> cstmrDocs) {
		super();
		this.cstmrId = cstmrId;
		this.fName = fName;
		this.lName = lName;
		this.mName = mName;
		this.cNo = cNo;
		this.email = email;
		this.addr = addr;
		this.emrgncyCNo = emrgncyCNo;
		this.cstmrDocs = cstmrDocs;
	}

	public ObjectId getCstmrId() {
		return cstmrId;
	}

	public void setCstmrId(ObjectId cstmrId) {
		this.cstmrId = cstmrId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getcNo() {
		return cNo;
	}

	public void setcNo(String cNo) {
		this.cNo = cNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmrgncyCNo() {
		return emrgncyCNo;
	}

	public void setEmrgncyCNo(String emrgncyCNo) {
		this.emrgncyCNo = emrgncyCNo;
	}

	public List<CstmrDocs> getCstmrDocs() {
		return cstmrDocs;
	}

	public void setCstmrDocs(List<CstmrDocs> cstmrDocs) {
		this.cstmrDocs = cstmrDocs;
	}

	@Override
	public String toString() {
		return "CstmrBasicInfo [cstmrId=" + cstmrId + ", fName=" + fName + ", lName=" + lName + ", mName=" + mName
				+ ", cNo=" + cNo + ", email=" + email + ", addr=" + addr + ", emrgncyCNo=" + emrgncyCNo + ", cstmrDocs="
				+ cstmrDocs + "]";
	}
	

}
