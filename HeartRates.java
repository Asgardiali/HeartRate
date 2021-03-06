package Homework1;

import java.util.Scanner;

public class HeartRates {
	
	private String FirstName, SecondName;		//instance variable
	private int Day,Mount,Year = 0;				//instance variable
	
	//Constructor
	
	public HeartRates(String FN, String SN, int d, int m, int y) 
	{
		 FirstName=FN;
		 SecondName=SN;
		 Day=d;
		 Mount=m;
		 Year=y;
	}
	
	//Main Program
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Calculate calc = new Calculate();
		
		Calculate Yashesap = new Calculate();
		
		//Take Name From User
		System.out.println("Please Enter Your First Name: ");
		String FN=input.nextLine();
		calc.setFirstName(FN);
				
		//Take Surname From User
		System.out.println("Please Enter Your Second Name: ");
		String SN=input.nextLine();
		calc.setSecondName(SN);
		
		//Take Day From User
		System.out.println("Please Enter Your Birth Date Of Day: ");
		int d=input.nextInt();
		calc.setDay(d);
		if(d>=32) {
			System.out.println("Please Enter Your Birth Date Of Day Between 1 and 31 ");
			d=input.nextInt();
		}	//İf ile girilen sayıların kontrolü 

		//Take Mount From User
		System.out.println("Please Enter Your Date Of Mount: ");
		int m=input.nextInt();
		calc.setMount(m);
		if(m>=13) {
			System.out.println("Please Enter Your Birth Date Of Mount Between 1 and 12 ");
			m=input.nextInt();
		}	//İf ile girilen sayıların kontrolü 
		
		//Take Year From User
		System.out.println("Please Enter Your Date Of Year: ");
		int y=input.nextInt();
		calc.setYear(y);
		if(y<=1900) {
			System.out.println("Please Enter Your Birth Date Of Year Over 1900 ");
			m=input.nextInt();
		}	//İf ile girilen sayıların kontrolü 
		
		int yas=2018-y;
		//Print Name Surname
		System.out.printf("Name:%s \t Surname:%s%n%n",calc.getFirstName(),calc.getSecondName());
		//Print Age
		System.out.printf("Your Age : %d%n%n",yas);
		int MaximumHeartRate=220-yas;
		//Print Maximum Heart Rate
		System.out.printf("Your Maximum Heart Rate : %d%n%n",MaximumHeartRate);
		//Print Target Heart Rate Range
		System.out.print("Target Heart Rate Range: "+ MaximumHeartRate * 0.5 + " to "+ MaximumHeartRate * 0.85);		
	}

}
