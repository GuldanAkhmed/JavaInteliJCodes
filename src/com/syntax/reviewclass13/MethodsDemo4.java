package com.syntax.reviewclass13;

public class MethodsDemo4 {
	
	double checkDiscount(boolean isSaleon,double originalPrice, double discount) {
	if (isSaleon) {
		return (originalPrice-originalPrice*discount);
		
	}else {
		return originalPrice;
		
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
	}

}
