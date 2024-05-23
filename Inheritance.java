package newas;
import java.lang.*;

class raj {

	String name;
	int age;
	String college;
	String department;
	int year_of_study;
}
public class Inheritance extends raj{
		static String feedback;
		static int D_O_B;
		
		public void enterdetails()
		{
			name="ABISHEK";
			age=22;
			college="MEC";
			department="CSE";
			year_of_study=2;
			feedback="GOOD";
			D_O_B=13_06_2002;
		}
		
		public void display() {
			
			System.out.println("MY NAME IS "+name);
			System.out.println("MY DEPARTMENT IS "+department);
			System.out.println("I AM A "+feedback+" STUDENT");
			
		}
		
	
	public static void main(String[] args) {
		
		Inheritance obj=new Inheritance();
		obj.enterdetails();
		obj.display();
		
	}
	}

