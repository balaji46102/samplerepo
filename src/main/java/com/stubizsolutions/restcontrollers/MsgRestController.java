package com.stubizsolutions.restcontrollers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class MsgRestController
{
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() 
	{
		String msg = "hi welcome yar";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@GetMapping("/features")
	public ResponseEntity<Void> feature()
	{
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	       //"GET REQUEST BY USING REQUEST PARAMETER"//
	@GetMapping("/request")
	public ResponseEntity<String> display(@RequestParam("name") String name)
	{
		String msg = "Hi "+name+" Welcome";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	//"GET REQUEST BY USING PATH PARAMETER"//
	@GetMapping("/para/{name}")
	public ResponseEntity<String> combo(@PathParam("name") String name)
	{
		String str = "plz select below option";
		
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}
}
