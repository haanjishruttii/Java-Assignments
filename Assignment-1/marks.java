//Question:-5
import java.util.Scanner;
class Infobeans{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the marks of hindi");
	   int hindi = sc.nextInt();
	   System.out.println("enter the marks of english");
	   int english = sc.nextInt();
	   System.out.println("enter the marks of maths");
	   int maths = sc.nextInt();
	   System.out.println("enter the marks of evs");
	   int evs = sc.nextInt();
	   System.out.println("enter the marks of gk");
	   int Gk = sc.nextInt();
	   

	   int Total;
	   Total =hindi+english+maths+evs+Gk;
	   double percentage=Total/5;
	   System.out.println("Percentage="+percentage);
	   String result=(percentage>60)?"Pass by first division":((percentage<59)&&(percentage>50))?"Pass by second devision":((percentage<49&&(percentage>33))?"Pass by third devision":"Fail");
	   System.out.println("Result="+result);
	  }
}
