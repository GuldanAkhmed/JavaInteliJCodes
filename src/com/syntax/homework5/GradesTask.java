package com.syntax.homework5;

import java.util.Scanner;

public class GradesTask {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your scores for quiz");
		int quiz=input.nextInt();
		System.out.println("Enter youe scores for midTerm");
		int midTerm=input.nextInt();
		System.out.println("Enter your scores for Finals");
		int finalScores=input.nextInt();
		int score=(quiz=midTerm+finalScores)/3;
		String grade=null;
		if(score>=90) {
			grade="A";
		}else if(score<90 &&score>=70) {
			grade="B";
		}else if(score>=50 && score<70) {
			grade="C";
		}else if(score<50) {
			grade="F";
			System.out.println("Your grade is: " +grade);
		}
		
		
		
		
		
		

	}

}
