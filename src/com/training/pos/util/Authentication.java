package com.training.pos.util;

public interface Authentication {

	public boolean authenticate(CredentialsBean credentialsBean);  
	public String authorize(String userId);
	public boolean changeLoginStatus(CredentialsBean credentialsBean, int loginStatus);
	
}
