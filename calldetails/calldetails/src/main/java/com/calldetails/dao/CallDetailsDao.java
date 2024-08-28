package com.calldetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calldetails.model.CallDetails;

@Repository

public interface CallDetailsDao extends JpaRepository<CallDetails,Integer> {

}
