//Question:-10
import java.util.Scanner;
class Infobeans{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("r=");
	   float r=sc.nextFloat();
	   System.out.println("h=");
	   float h=sc.nextFloat();
	   float V=22/7*r*r*h;
	   System.out.println("Volume of cylinder="+V);
	}
}
