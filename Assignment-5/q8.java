//Question-8

import java.util.Scanner;
class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int i=1,a=0,b=1,c,n;
		n=sc.nextInt();
		while(i<=n)
		    {
		     System.out.println(a);
		        c=a+b;
		        a=b;
		        b=c;
		     i++;
		    }
	}
}
