package com.syntax.homework13;

public class HWMethod6 {
	char getGradeScore (int score) {
		if (score>=90) {
			return 'A';
					
		}else if (score>=80) {
			return 'B';
			}else if (score>=70) {
				return 'C';
			}else if (score>=50) {
				return 'D';
				
			}else {
				return 'F';
			}		
				
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HWMethod6 obj=new HWMethod6();
         System.out.println(obj.getGradeScore(80));
         System.out.println(obj.getGradeScore(70));
	}

}
