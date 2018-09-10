package com.training.pos.util;

import com.training.pos.bean.CredentialsBean;
import com.training.pos.bean.ProfileBean;

public class UserImpl implements User {

	@Override
	public boolean logout(String userId) {
		//Return value must be either: "SUCCESS", "FAIL", “INVALID”
		return false;
	}

	@Override
	public String login(CredentialsBean credentialsBean) {
		
		//Return value must be either: "A", "C", "FAIL", “INVALID”
				//A->Admin, C->Customer
				//Wrong username/password should return INVALID.
		return null;
	}

	@Override
	public String changePassword(CredentialsBean credentialsBean, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String register(ProfileBean profileBean) {
		//Return value must be either: <userId of lenght 6>, "FAIL"
		//Note: userId-> first 2 letter of first name followed by 4 digit auto generated number
		return null;
	}

}
