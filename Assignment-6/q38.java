//Question-38

import java.uti.Scanner;
class Main{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   int n, c, arm=0, r;
	   n=sc.nextInt();
	   c=n;
	   while(n>0)
	   {
		r=n%10;
		arm=(r*r*r)+arm;
		n=n/10;
	   }
	   if(c==arm)
                {
	           System.out.println("It is armstrong");
	       }
	       else
	       {
		  System.out.println("It is not armstrong");
	       }
	}
}
