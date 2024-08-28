package com.calldetails.model;

import java.time.LocalDateTime;

//import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CallDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fromCallerId;
    private String toCallerId;
    private LocalDateTime startingCallTime;
    private LocalDateTime endingCallTime;
    private Long totalDurationOfCall;
	
	CallDetails(){
		
	}
	

	public CallDetails(Long id, String fromCallerId, String toCallerId, LocalDateTime startingCallTime,
			LocalDateTime endingCallTime, Long totalDurationOfCall) {
		super();
		this.id = id;
		this.fromCallerId = fromCallerId;
		this.toCallerId = toCallerId;
		this.startingCallTime = startingCallTime;
		this.endingCallTime = endingCallTime;
		this.totalDurationOfCall = totalDurationOfCall;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFromCallerId() {
		return fromCallerId;
	}

	public void setFromCallerId(String fromCallerId) {
		this.fromCallerId = fromCallerId;
	}

	public String getToCallerId() {
		return toCallerId;
	}

	public void setToCallerId(String toCallerId) {
		this.toCallerId = toCallerId;
	}

	public LocalDateTime getStartingCallTime() {
		return startingCallTime;
	}

	public void setStartingCallTime(LocalDateTime startingCallTime) {
		this.startingCallTime = startingCallTime;
		updateTotalDuration();
	}

	public LocalDateTime getEndingCallTime() {
		return endingCallTime;
	}

	public void setEndingCallTime(LocalDateTime endingCallTime) {
		this.endingCallTime = endingCallTime;
		updateTotalDuration();
	}

	public Long getTotalDurationOfCall() {
		return totalDurationOfCall;
	}

	public void setTotalDurationOfCall(Long totalDurationOfCall) {
		this.totalDurationOfCall = totalDurationOfCall;
	}

	@Override
	public String toString() {
		return "CallDetails [id=" + id + ", fromCallerId=" + fromCallerId + ", toCallerId=" + toCallerId
				+ ", startingCallTime=" + startingCallTime + ", endingCallTime=" + endingCallTime
				+ ", totalDurationOfCall=" + totalDurationOfCall + "]";
	}
	
	private void updateTotalDuration() {
        if (startingCallTime != null && endingCallTime != null) {
            this.totalDurationOfCall = java.time.Duration.between(startingCallTime, endingCallTime).toSeconds();
        } else {
            this.totalDurationOfCall = null;
        }
    }

	
	

}