package com.training.pos.util;

import com.training.pos.bean.CredentialsBean;

public class AuthenticationImpl implements Authentication {

	@Override
	public String authorize(String userId) {
		//write the logic to authorize the user
		return null;
	}

	@Override
	public boolean authenticate(CredentialsBean credentialsBean) {
		//Write the logic to authenticate the user and admin(follow documentaion for more info)
		return false;
	}

	@Override
	public boolean changeLoginStatus(CredentialsBean credentialsBean, int loginStatus) {
		 //Write the logic to change the login status
		return false;
	}


}
