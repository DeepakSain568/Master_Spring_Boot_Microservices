package com.LearnSpringBoot.first.Controller;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.LearnSpringBoot.first.DTO.RequestDTO;

@RestController 
@RequestMapping(path="/api/")
public class Controller0 {
	
	@InitBinder
	public void initBinder(DataBinder binder) {
		binder.registerCustomEditor(Date.class,"date", new DateResolver());
	}
	
	@GetMapping(path="/1")
	public String getData() {
		return "data";	}
	
	@GetMapping(path="/2")
	public String getData(@RequestParam(name="name")String Name,@RequestParam(value="age",required = false)Integer Age) {
		
		return (new Date()+"name: "+Name+" Age: "+Age);
	}
	
	
	
	@GetMapping(value="/3")
	public String getData(@RequestParam(value = "date")String date,@RequestParam(name = "val")boolean val) {
		System.out.println(date);
		return date.toString();
	}
	
	@GetMapping(value="/4/{userid}/{username}")
	public String getUserDetails(@PathVariable("userid")String id,@PathVariable("username") String username) {
		
		return ("id: "+id+" hii "+username);
	}
	
	@GetMapping("4/{moviename}")
	public String getMovieName(@PathVariable("moviename")String movie) {
		return movie;
	}
	
	@PostMapping("4/userData")
	public String createUser(@RequestBody RequestDTO requestDTO) {
		
		return "User Created !!!!!!!!!!! \n Welcome "+requestDTO.getUserName();
	}
	
	@GetMapping("/5/{67890}")
	public ResponseEntity<String> getUserDetails(@RequestParam(name="query")String query,@PathVariable("userId") Integer userId){
		String Output = "userId: "+userId+"\n your query: "+query+" is resolved ";
		return ResponseEntity.status(HttpStatus.OK).body(Output);
		
	}
 
}


 class DateResolver extends PropertyEditorSupport{
	 
	 @Override
	public void setAsText(String text) throws java.lang.IllegalArgumentException{
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		 try {
			Date date = formatter.parse(text);
			setValue(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	
}
