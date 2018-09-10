package com.training.pos.util;

import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.ProfileBean;

public interface User {

	
	public String login(CredentialsBean credentialsBean);
	public boolean logout(String userId);
	public String changePassword(CredentialsBean credentialsBean, String newPassword);
	public String register(ProfileBean profileBean);
	
}
