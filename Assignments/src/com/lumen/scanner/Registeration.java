package com.lumen.scanner;

import java.util.Scanner;

public class Registeration {

	public static void main(String[] args) {
	String[] usernames= {"siva","kumar","ravi","raju"};
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter your name");
	String name=scanner.next();
	System.out.println(name);
	int count=1;
	for(int i=0;i<usernames.length;i++) {
		if(usernames[i].equals(name)) {
			System.out.println("u name is not unique");
			count=0;
			break;
		}
	
	}
	if(count==1)
	System.out.println("you are registered");
	scanner.close();
}

}
