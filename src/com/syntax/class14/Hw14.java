package com.syntax.class14;

import java.util.Scanner;

public class Hw14 {
	String createAccount (String userName, String passWord, String confirm) {
		if (userName.isEmpty()|| passWord.isEmpty()) {
		return "Username and Password cannot be empty.";
		}else if (passWord.length()<8){
			return "Password is too short.";
		}else if(passWord.equalsIgnoreCase(userName)) {
			return "Password cannot contain username.";
		}else if(!passWord.equals(confirm)) {
			return "Password do not match.";
		}else {
		  return "Your account has been created succesfully.";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Hw14 obj=new Hw14();
      Scanner input=new Scanner(System.in);
	System.out.println("PLease enter your username");
	String userName=input.nextLine();
	System.out.println("Please enter your password");
	String passWord=input.nextLine();
	System.out.println("PLease confitm your password");
	String confirm=input.nextLine();
	System.out.println(obj.createAccount(userName,passWord,confirm));
		
		
		
	}

}
