package com.calldetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.calldetails.dao.CallDetailsDao;
import com.calldetails.model.CallDetails;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CallDetailsService {
	@Autowired
	CallDetailsDao callDetailsDao;
	public String addCustomer(CallDetails calldetails) {
		callDetailsDao.save(calldetails);
		return "Added";
	}
	public   List<CallDetails> getCallDetails() {
		List<CallDetails>  calldetailsList=callDetailsDao.findAll();
		return calldetailsList;
	}
	public CallDetails deleteCallDetails(Integer callid) {
		CallDetails calldetails1=callDetailsDao.findById(callid).get();
		if(calldetails1!=null)
			callDetailsDao.deleteById(callid);
		return calldetails1;
		}

	

}
