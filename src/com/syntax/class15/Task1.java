package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		String username="Asel";
		String password="pass1234";
		String confirmedPassword="pass12345";
		if (!username.isEmpty() || password.isEmpty()){
			System.out.println("Username and password can not be empty");
		}else {
			if(password.length()<8) {
				System.out.println("Password os cannot be empty");
			}else {
                if(password.contains(username)) {
				System.out.println("Password cannot contain username");
			}else {
				if(password.equals(confirmedPassword)) {
					System.out.println("Your username an password has been created");
				}else {
					System.out.println("Password do not match");
				}
			}
			}
		}
	}
}	