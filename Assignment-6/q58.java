//Question-58

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r;
		long result=0;
		int pos=0;
		while(n>0)
		{
		    r=n%2;
		    result=r*(int)Math.pow(10,pos)+result;
		    pos++;
		    n=n/2;
		}
		System.out.print(result);
	}
}

