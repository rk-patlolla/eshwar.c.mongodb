package com.rohteksolutions.service;

import org.bson.types.ObjectId;
import org.springframework.web.multipart.MultipartFile;

import com.rohteksolutions.document.CstmrBasicInfo;

public interface CstmrBasicInfoService {
	
	CstmrBasicInfo addCstmr(CstmrBasicInfo cstmrBasicInfo);
	CstmrBasicInfo addCstmrDocs(ObjectId id,MultipartFile file);

}
