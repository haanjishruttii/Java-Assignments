//Question-56

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int fact;
		for(int i=n;i<=m;i++)
		{
		    fact=1;
		    for(int k=2;k<=i;k++)
		    {
		        fact=fact*k;
		    }
		    System.out.println("Factorial of "+i+" is: "+fact);
		}
	}
}
