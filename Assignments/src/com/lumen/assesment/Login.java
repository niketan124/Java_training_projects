package com.lumen.assesment;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usernames[] = {"niketan","karthik","viswa"};
		Scanner scanner = new Scanner(System.in);
		String uname = scanner.nextLine();
		boolean flag = false;
		for (String username : usernames) {
			if(username.equals(uname)) {
				System.out.println("Login sucess");
				return;
			}
		}
		if(!flag) {
			System.out.println("Please register");
		}
		
		scanner.close();
		
	}

}
