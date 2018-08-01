package com.rohteksolutions.document;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class CstmrDocs implements Serializable {
	
	private MultipartFile file;

	public CstmrDocs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CstmrDocs(MultipartFile file) {
		super();
		this.file = file;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "CstmrDocs [file=" + file + "]";
	}
	
	

}
