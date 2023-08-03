package com.userapp.client;

import com.userapp.service.IvalidateServicesImpl;

public class IvalidateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IvalidateServicesImpl ival = new IvalidateServicesImpl();
		
		try {			
//			ival.validateUsername("niketan");
			ival.validatePassword("nns");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
