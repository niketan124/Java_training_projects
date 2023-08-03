package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public interface IvalidationService {
	
	boolean validateUsername(String userName) throws NameExistsException;
	boolean validatePassword(String userName) throws TooLongException, TooShortException;

}
