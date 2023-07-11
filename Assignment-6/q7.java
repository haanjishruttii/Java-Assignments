//Question-7

import java.util.Scanner;
class Main{
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    int n;
	    n=sc.nextInt();
	    boolean flag=false;
             for(int i=1; i<=n; i++)
             {
	        if(n%i==0)
	        {
	            flag=true;
		//break;
	        }
	    }
	        if(!flag)
	            System.out.println(n+" is a prime");
	        else
		   System.out.println(n+" is non prime");
	}
}
