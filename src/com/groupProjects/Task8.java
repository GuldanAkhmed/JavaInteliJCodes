package com.groupProjects;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] arr= {10,20,90,50,70};
  int largest=arr[0];
  for(int elements:arr) {
	  if(elements>largest) {
		  largest=elements;
		  
	  }
  }
	System.out.println("Largest number is "+largest);	
		System.out.println("----------------------------");
	int[] arr1= {10,20,90,50,70};
	  int smallest=arr[0];
	  for(int elements:arr) {
		  if(elements>largest) {
			  largest=elements;
			  
		  }
		  if(elements<smallest) {
			  smallest=elements;
			System.out.println("Smallest number is "+smallest);  
			  
			  
			  
		  }
	  }
		
		
		
		
	}

}
