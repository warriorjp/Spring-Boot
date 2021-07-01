package com.upload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javassist.bytecode.stackmap.BasicBlock.Catch;

@RestController
public class controller {
	
	@Autowired
	private Helper Helper;

  
		
	
	
	
	@PostMapping("upload")
	public ResponseEntity<String> uploadfile(@RequestParam("file") MultipartFile file) {
		
		try {
			
		
		
		if(file.isEmpty())
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("request must contain file");
			
		}else {
			boolean f=Helper.uploadfile(file);
			if(f) {
			//return ResponseEntity.ok("succesfully upload.....");
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());
			
			}
		} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		
		
	}
}
