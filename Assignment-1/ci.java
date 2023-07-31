// Question 11:-
import java.util.Scanner;
class Infobeans{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Principle=");
	   double p=sc.nextDouble();
	   System.out.println("Rate=");
	   double r=sc.nextDouble();
	   System.out.println("Time=");
	   double n=sc.nextDouble();
	   double A=p*(1+r/100);
	   A=Math.pow((1+r/100),n);
	   A=A*p;
	   System.out.println("Ammount="+A);
	   double CI=A-p;
	   System.out.println("Compound Interest="+CI);
	}
}
