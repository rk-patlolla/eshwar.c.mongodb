package com.rohteksolutions.service;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.rohteksolutions.document.CstmrBasicInfo;
import com.rohteksolutions.document.CstmrDocs;

@Service
public class CstmrBasicInfoServiceimpl implements CstmrBasicInfoService {

	@Autowired
	MongoTemplate mongoTemplate;
	
	@Autowired
	private GridFsOperations gridFsOperations;
	
	@Override
	public CstmrBasicInfo addCstmr(CstmrBasicInfo cstmrBasicInfo) {
		mongoTemplate.save(cstmrBasicInfo);
		return null;
	}

	/*@Override
	public CstmrBasicInfo addCstmrDocs(ObjectId id, MultipartFile file) {
		CstmrDocs docs = new CstmrDocs();
		List<CstmrDocs> docsList = new ArrayList<CstmrDocs>();
		docs.setFile(file);
		docsList.add(docs);
		CstmrBasicInfo cstmr = new CstmrBasicInfo();
		cstmr.setCstmrId(id);
		cstmr.setCstmrDocs(docsList);
		MongoDatabase db = mongoTemplate.getDb();
		GridFS gfsPhoto = new GridFS(db);
        GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
        gfsFile.setFilename(dbFileName);
        gfsFile.save();
		MongoCollection<Document> coll = db.getCollection("cstmr");
		DBObject dbo = new BasicDBObject();
		dbo.put("file", file);
		coll.upda
		 Query query = new Query(Criteria.where("_id").is(id));
//	        Update update = new Update();
//	        update.set("file", file);
	        DBObject dbDoc = new BasicDBObject();
	        mongoTemplate.getConverter().write((Object)cstmr, dbDoc);
	        Update update = Update.fromDBObject(dbDoc);

	        //run it!
	        mongoTemplate.upsert(query, update, "descriptions");
		try {
		UpdateResult result = mongoTemplate.updateFirst(query, update, CstmrBasicInfo.class);
		}
		catch(MongoException ex){
			System.out.println(ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}*/
	
	@Override
	public CstmrBasicInfo addCstmrDocs(ObjectId id, MultipartFile file) {
		CstmrDocs docs = new CstmrDocs();
		List<CstmrDocs> docsList = new ArrayList<CstmrDocs>();
		docs.setFile(file);
		docsList.add(docs);
		CstmrBasicInfo cstmr = new CstmrBasicInfo();
		cstmr.setCstmrId(id);
		cstmr.setCstmrDocs(docsList);
		DBObject metaData = new BasicDBObject();
		metaData.put("organization", "JavaSampleApproach");
		try {
			InputStream iamgeStream = new BufferedInputStream(file.getInputStream());
			String imageFileId  = gridFsOperations.store(iamgeStream, "jsa-logo.png", "image/png", metaData).get().toString();
			System.out.println("ImageFileId = " + imageFileId);
	 
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}
	

}
