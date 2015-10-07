package mainPackage;

import java.util.Scanner;

public class Quarterback {
public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
	
		System.out.print("Enter number of touchdowns: ");
		double TD = in.nextDouble();
		
		System.out.print("Enter total number of yards: ");
		double Yards = in.nextDouble();
		
		System.out.print("Enter number of interceptions: ");
		double INT = in.nextDouble();
		
		System.out.print("Enter number of completions: ");
		double comp= in.nextDouble();
		
		System.out.print("Enter number of passes attempted: ");
		double ATT = in.nextDouble();
		
		in.close();
		
		double a;
		double b;
		double c;
		double d;
		
		a = (comp/ATT - 0.3)*5;
		b =(Yards/ATT -3)*0.25;
		c = (TD/ATT)*20;
		d = 2.375- ((INT/ATT)*25);
			

		double QBRating = ((a+b+c+d)/6)*100;
		System.out.printf("The passer rating is ", QBRating);
 }

}
