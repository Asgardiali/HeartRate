package Homework1;

public class Calculate {
	
	
	private String FirstName, SecondName;
	private int Day,Mount,Year = 0;
	
	//Set FirstName=FN  //method of set the name in the object
	
	public void setFirstName(String FN) {
		this.FirstName=FN;
	}
	
	//Get FirstName=Fn //method to retrieve the name from the object
	public String getFirstName() {
		return FirstName;					//return value of name to caller
	}
	
	//Set SecondName=SN	//method of set the name in the object
	public void setSecondName(String SN) {
		this.SecondName=SN;
	}
	
	//Get SecondName=SN 	//method to retrieve the name from the object
	public String getSecondName() {
		return SecondName;					//return value of name to caller
	}
	
	//Set Day=d		//method of set the name in the object
	
	public void setDay(int d) {
		this.Day=d;
	}
	
	//Get Day=d			//method to retrieve the name from the object
	
	public int getDay() {
		return Day;						//return value of name to caller
	}
	
	//Set Mount=m		//method of set the name in the object
	
	public void setMount(int m) {
		this.Mount=m;
	}
		
	//Get Mount=M		//method to retrieve the name from the object
		
	public int getMount() {
		return Mount;					//return value of name to caller
	}
	
	//Set Year=y	//method of set the name in the object
	
	public void setYear(int y) {
		this.Year=y;
	}
		
	//Get Year=y		//method to retrieve the name from the object
		
	public int getYear() {
		return Year;				//return value of name to caller
	}	
	
	
}
