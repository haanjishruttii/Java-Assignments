//Question-13

import java.util.Scanner;
class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n,r,reverse=0;
		n=sc.nextInt();
		while(n>0)
		    {
		        r=n%10;
		        reverse=(reverse*10)+r;
		        n=n/10;
		       
		    }
		  System.out.println("Reverse="+reverse);
    }
}
