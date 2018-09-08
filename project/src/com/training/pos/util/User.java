package com.training.pos.util;

public interface User {

	
	public String login(CredentialsBean credentialsBean);
	//Return value must be either: "A", "C", "FAIL", “INVALID”
	//A->Admin, C->Customer
	//Wrong username/password should return INVALID.
	public boolean logout(String userId);
	public String changePassword(CredentialsBean credentialsBean, String newPassword);
	//Return value must be either: "SUCCESS", "FAIL", “INVALID”
	public String register(ProfileBean profileBean);
	//Return value must be either: <userId of lenght 6>, "FAIL"
	//Note: userId-> first 2 letter of first name followed by 4 digit auto generated number
}
