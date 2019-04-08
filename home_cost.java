
import java.util.Scanner;
class Cost{
	public static void main(String args[]){
		int standard_materials= 1200, above_standard_materials= 1500, high_standard_materials=1800, high_automated_home=2500;
		Scanner sc=new Scanner(System.in);
		// reading the no of sq.ft of area of the home
		System.out.println("enter the area of the home in square feet");
		int n= sc.nextInt();
		System.out.println("cost of an automated home: "+ n* (high_automated_home-high_standard_materials));
	
	}

}