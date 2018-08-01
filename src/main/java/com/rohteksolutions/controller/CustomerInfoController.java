package com.rohteksolutions.controller;

import javax.swing.plaf.multi.MultiPanelUI;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.rohteksolutions.document.CstmrBasicInfo;
import com.rohteksolutions.service.CstmrBasicInfoService;

@RestController
@RequestMapping("/cstmrBasic")
public class CustomerInfoController {
	
	@Autowired
	CstmrBasicInfoService cstmrBasicInfoService;
	
	@RequestMapping(value="/addCustomer", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody CstmrBasicInfo addCustomer(@RequestBody CstmrBasicInfo cstmrBasicInfo)
	{
		try
		{
	CstmrBasicInfo inserted = cstmrBasicInfoService.addCstmr(cstmrBasicInfo);
		return inserted;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	@RequestMapping(value="/updateAadhar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody CstmrBasicInfo addCustomer(@RequestParam("file") MultipartFile file,@RequestParam("id") ObjectId id)
	{
		try
		{
	cstmrBasicInfoService.addCstmrDocs(id, file);
		return null;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			return null;
		}
	}
}
