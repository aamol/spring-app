/**
 * 
 */
package com.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.bean.Content;
import com.sapient.repository.ContentRepository;

/**
 * @author aamol
 *
 */

@RestController
public class ContentRestController {

	@Autowired
	private ContentRepository contentRepository;
	
	@RequestMapping("/content")
	public Content getContent(@RequestParam(value = "contentID") String contentID) {
		
		Content content= contentRepository.findByContentID(contentID);
		
		return content;
	}
	
	
	@RequestMapping("/contentSet")
	public String setContent(@RequestHeader(value ="contentID") String contentID , @RequestBody String contentData){
		Content newContent = new Content("header", contentData);
		contentRepository.save(newContent);
		
		return "200";
	}

}
