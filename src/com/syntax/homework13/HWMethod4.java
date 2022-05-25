package com.syntax.homework13;

public class HWMethod4 {
	//Create a method createEmail(). Based on values of users name, 
	//lastName and email type, your method should return complete email Address. 
			//Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com 
	  
	String createEmail(String name, String lastName, String gmail) {
		return name +lastName + "@" + gmail + ".com";
		
	}
	
	public static void main(String[] args) {
		HWMethod4 method=new HWMethod4();
		System.out.println(method.createEmail("john", "snow","gmail"));
	}

}
