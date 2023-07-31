//Question:-7
import java.util.Scanner;
class Infobeans{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Principal=");
	   double p=sc.nextDouble();
	   System.out.println("Rate=");
	   double r=sc.nextDouble();
	   System.out.println("Time=");
	   double t=sc.nextDouble();
	   double SI=(double)(p*r*t)/100;
	   System.out.println("Simple Interest="+SI);
	   
	    
	   
	}
}
