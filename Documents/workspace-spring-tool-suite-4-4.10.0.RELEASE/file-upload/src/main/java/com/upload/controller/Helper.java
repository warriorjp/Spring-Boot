package com.upload.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;



@Component
public class Helper {
//public final String upload_dir="C:\\Users\\Jay\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\file-upload\\src\\main\\resources\\static\\image";
public final String upload_dir=new ClassPathResource("static/image/").getFile().getAbsolutePath();

public Helper()throws IOException{
	
}
public boolean uploadfile(MultipartFile multipartFile) {
	
	boolean f=false;
	try {
	
		Files.copy(multipartFile.getInputStream(),Paths.get(upload_dir+File.separator+multipartFile.getOriginalFilename()) ,StandardCopyOption.REPLACE_EXISTING) ;   
		f=true;
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return f;
}
}
