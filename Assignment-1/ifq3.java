//Question:-3
//if............else
import java.util.Scanner;
class Infobeans{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   int age;
	   System.out.println("Enter age of the person");
	   age=sc.nextInt();
	   if(age>=18){
	   System.out.println("Eligible for voting");
	   }
	   else{
	   System.out.println("Not eligible for voting");
	  }
	} 
} 
