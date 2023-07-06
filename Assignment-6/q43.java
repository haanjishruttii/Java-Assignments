//Question-43

import java.util.Scanner;
class Main{
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int r, c=1, a=0, sum=0;
	        while(n>0)
	        {
	            r=n%10;
		   n=n/10;
		   c=1;
		for(int i=1; i<=a; i++)
		{
		   c=c*2;
		}
			sum=sum+c*r;
		}
	 		System.out.println(sum);
	}
}
