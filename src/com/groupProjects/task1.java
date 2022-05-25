package com.groupProjects;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int size=scanner.nextInt();
		System.out.println("Size of the Array "+size);
		int[] array=new int[size];
		System.out.println("PLease enter "+size+" element");
		for(int i=0;i<size;i++) {
		System.out.println("Please enter the element for index "+i);
			array[i]=scanner.nextInt();
		
		}
		

		System.out.println(Arrays.toString(array));
		
		int sum=0;for(int x=0;x<size; x++) {
			sum=sum+array[x];
			
		}
		
		
	}

}
