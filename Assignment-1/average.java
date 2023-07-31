//Question:-6
import java.util.Scanner;
class Infobeans{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("First num=");
	   int a= sc.nextInt();
	   System.out.println("Second num=");
	   int b= sc.nextInt();
	   System.out.println("Third num=");
	   int c= sc.nextInt();
	   System.out.println("Fourth num=");
	   int d= sc.nextInt();
	   System.out.println("Fifth num=");
	   int e= sc.nextInt();
	   
	   int Total= (a+b+c+d+e);
	   double average=Total/5;
	   System.out.println("Average of numbers="+average);
	 }
}
