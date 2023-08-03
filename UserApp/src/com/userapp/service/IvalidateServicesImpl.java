package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class IvalidateServicesImpl implements IvalidationService {
	
	String[] userNames = new String[] {"niketan","amar","ganesh"};
	@Override
	public boolean validateUsername(String userName) throws NameExistsException {
		// TODO Auto-generated method stub
		for (String name : userNames) {
			if(name.equals(userName)) {
				throw new NameExistsException("Name Already Exists");
			}
		}
		return true;
	}

	@Override
	public boolean validatePassword(String userName) throws TooLongException, TooShortException {
		// TODO Auto-generated method stub
		if(userName.length()<4) {
			throw new TooShortException("Password too short");
		}
		if(userName.length()>10) {
			throw new TooLongException("Password too long");
		}
		return true;
	}

}
