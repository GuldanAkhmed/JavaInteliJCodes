package com.syntax.homework13;

public class PrimeNumber {
	
	String isPrime(int num) {
		if (num>1) {
			for (int i=2; i<num;i++) {
				if (num%i==0) {
				return num+ " Not prime number";	
				}
			}
		}else {
			return num+ "not prime number";
		}
		return num + " is prime number";
	}
	public static void main(String[] args) {
		PrimeNumber obj=new PrimeNumber();
		System.out.println(obj.isPrime(9));
		System.out.println(obj.isPrime(2));
	}

}
