package com.syntax.homework13;

public  class HWMethod1 {
    
	  int getLargest(int num1,int num2) {
		  if (num1>num2) {
		return num1;
		  }else  {
			  return num2;
		  }
	  }
		  public static void main(String [] args){
			  HWMethod1 method= new HWMethod1();
	int max=method.getLargest(112,333);
			System.out.println(max);   
		  } 
}
		  
		  
	  
    

