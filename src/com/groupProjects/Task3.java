package com.groupProjects;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a 2D array of integer type where you will store odd and even numbers.
		 *  Develop a program which will identify/print the even numbers only.
		 */
		
     int[][]array2D = {{2,3,4},{5,6,},{12,6,8}};

		for (int x = 0; x < array2D.length; x++) {
			
			for (int y = 0; y < array2D[x].length; y++) {
				int element=array2D[x][y];
				if(element%2==0) {
					System.out.println(element);
				}
			}
		}
		
}
		
		
		
		
		
		
	}


