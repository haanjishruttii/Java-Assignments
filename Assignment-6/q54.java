//Question-54

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n%2==1)
		{
		    n++;
		}
		for(int i=n;i<=m;i=i+2)
		{
		    System.out.println(i);
		}
		
	}
}
