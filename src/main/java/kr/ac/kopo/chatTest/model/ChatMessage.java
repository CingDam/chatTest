package kr.ac.kopo.chatTest.model;

import java.util.Date;

public class ChatMessage {
	private int messageCode;
	private int userCode;
	private int roomCode;
	private Date messageRegDate;
	private char messageCheck;
	private String messageContents;
	
	public int getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(int messageCode) {
		this.messageCode = messageCode;
	}
	public int getUserCode() {
		return userCode;
	}
	public void setUserCode(int userCode) {
		this.userCode = userCode;
	}
	public int getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(int roomCode) {
		this.roomCode = roomCode;
	}
	public Date getMessageRegDate() {
		return messageRegDate;
	}
	public void setMessageRegDate(Date messageRegDate) {
		this.messageRegDate = messageRegDate;
	}
	public char getMessageCheck() {
		return messageCheck;
	}
	public void setMessageCheck(char messageCheck) {
		this.messageCheck = messageCheck;
	}
	public String getMessageContents() {
		return messageContents;
	}
	public void setMessageContents(String messageContents) {
		this.messageContents = messageContents;
	}
	
	
}
