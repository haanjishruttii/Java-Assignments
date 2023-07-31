//Question:-4
import java.util.Scanner;
class Infobeans{
	public static void main(String args[]){
	   float c;
	   int f;
	   System.out.println("Temperature in Fahrenheit=");
	   Scanner sc=new Scanner(System.in);
	   f=sc.nextInt();
	   c=((f-32)*5/9);
	   System.out.println(" Fahrenheit into celcius="+c);
	}
}
