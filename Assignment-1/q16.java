//Question:-16
import java.util.Scanner;
class Infobeans{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   int a,b,c;
	   System.out.println("Enter the value of a=");
	   a=sc.nextInt();
	   b=sc.nextInt();
	   String d=(a==b)?"Equal":"Not Equal";
	   c=(a>b)?a:b;
	   System.out.println("Greater number"+c);
	}
}
