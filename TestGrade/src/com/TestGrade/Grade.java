package com.TestGrade;

public class Grade {

	public static void main(String[] args) {
		 int TestScore =82;
		 char grade ;
		 
		 if (TestScore >= 90) {
			 grade = 'A';
		 }
		 else if (TestScore >= 70) {
			 grade = 'B';
		
         }
		 else if (TestScore >= 60) {
			 grade = 'C';
		 }
			 else  {
				 grade = 'D';
			
}
		 System.out.println("the grade is " + grade );
	}
}