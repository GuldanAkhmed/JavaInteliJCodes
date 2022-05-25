package com.syntax.reviewclass13;

public class MethodsDemo3 {
	int squareTheNumber(int number) {
		return number*number;
		
	}
	int returnTheSameNumber(int number) {
		return number;
	}
	
	String getproperAnimalByExpert(String expertName,String animalName) {
			
			if("Teyfur".equalsIgnoreCase(expertName) && "Horse".equalsIgnoreCase(animalName)) {
				return "camel";
			}else if("Horse".equals(animalName)) {
				return "Horse";
			}else {
				return "I don't know";
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MethodsDemo3 obj=new MethodsDemo3();
   int result =obj.returnTheSameNumber(5);
   System.out.println(result);
	}

}
