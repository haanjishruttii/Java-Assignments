//Question-60

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n;i<=m;i++)
		{
		    System.out.println("Square of "+i+" is: "+i*i);
		    System.out.println("Cube of "+i+" is: "+i*i*i);
		    System.out.println("Square Root of "+i+" is: "+Math.sqrt(i));
		    System.out.println();
		}
	}
}

