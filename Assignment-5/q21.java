//Question-21

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int i=101, reverse=0,r;
	    while(i<=199)
	    {
	        int n=i;
	        reverse=0;
	        while(n!=0)
	        {
	            r=n%10;
	            reverse=(reverse*10)+r;
	            n=n/10;
	        }
	    
	       i++; 
	    
	   System.out.println(reverse);
	    
	    }
	}


