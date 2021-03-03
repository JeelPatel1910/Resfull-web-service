package com.pproject.ws.ui.model.response;

import java.util.Date;

public class ErrorMessage {
	
	public ErrorMessage() {}

	public ErrorMessage(Date timeStamps, String message) {
		
		this.timeStamps = timeStamps;
		this.message = message;
	}

	private Date timeStamps;

	public Date getTimeStamps() {
		return timeStamps;
	}

	public void setTimeStamps(Date timeStamps) {
		this.timeStamps = timeStamps;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;
}
