package com.lumen.assesment;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userNames[] = {"niketan","karthik","kind","viswa"};
		Scanner scanner = new Scanner(System.in);
		String urname = scanner.nextLine();
		boolean flag = true;
		for (String user : userNames) {
			if(user.equals(urname)) {
				System.out.println("Not a Unique name");
				return;
			}
		} 
		if (flag){
			System.out.println("You are registered");
		}
		

	}

}
