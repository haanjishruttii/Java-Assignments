
// Question :27

import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		char ch;
		System.out.println("Enter a character : ");
		ch =sc.next().charAt(0);
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')) 
		{
		    System.out.println("It is a vowel");
		}
		else
		{
		    System.out.println("It is consonent");
		}
	}
}
