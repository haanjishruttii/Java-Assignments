// Question :11

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char gender;
		int  age;
		System.out.println("Enter the gender of employee M/F : ");
		gender =sc.next().charAt(0);
		System.out.println("Enter the age of employee : ");
		age=sc.nextInt();
		if((gender=='f')||(gender=='F'))
		{
		    System.out.println("She will work only  in urban areas");
		}
		if(((gender=='m')||(gender=='M'))&&(age>=20)&&(age<40))
		{
		    System.out.println("He may work anywhere");
		}
		if(((gender=='m')||(gender=='M'))&&(age>40)&&(age<=60))
		{
		    System.out.println("He will work only in urban areas");
		}
		if(((gender=='m')||(gender=='M'))&&(age<20)||(age>60))
		{
		    System.out.println("Error");
		}
	}
}
