//Question-15

import java.util.Scanner;
class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n,r,arm=0;
		n=sc.nextInt();
		int a=n;
		while(n>0)
		    {
		        r=n%10;
		        arm=(r*r*r)+arm;
		        n=n/10;
		       
		    }

	    
	    if (a==arm)
	  { System.out.println("armstrong");}
	   else{System.out.println("not");}
    }
}
