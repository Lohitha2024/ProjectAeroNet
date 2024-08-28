package com.calldetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.calldetails.model.CallDetails;
import com.calldetails.service.CallDetailsService;

@RestController
public class CallDetailsController {
	
	@Autowired
	CallDetailsService callDetailsService;
	@GetMapping("/calldetails")
	public List<CallDetails> getCallDetails() {
		
		return callDetailsService.getCallDetails();
	}
	@PostMapping("/calldetails") 
	  public String  addCallDetails(@RequestBody	  CallDetails calldetails) {
		    String result= callDetailsService.addCustomer(calldetails);
		  return  result;
	  }
	@DeleteMapping("/calldetails/{callid}") 
	public CallDetails deleteCallDetails(@PathVariable("callid") Integer callid) {
		
		return  callDetailsService.deleteCallDetails(callid);
	}

}
