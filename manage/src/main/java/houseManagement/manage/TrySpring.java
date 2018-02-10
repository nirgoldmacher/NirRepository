package houseManagement.manage;

import usersService.model.User;

public class TrySpring {

	private String message = null;
	public TrySpring(String message) {
		this.message = message;
	}
	
	public TrySpring() {
		this.message = "Hello World!";
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println("message:" + message);
	}
	
	public User getUserByID(int id) {
		return null;
	}
}
