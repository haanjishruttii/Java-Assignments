//Question-39

import java.uti.Scanner;
class Main{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int r, sum=0;
	while(n>0){
	    r=n%10;
	    n=n/10;
	    int a=1;
	    for(int i=1; i<=r; i++)
	    {
	        a=a*i;
  	    }
	    sum=sum+a;
	    }
	    if(sum==n)
		System.out.println("Strong");
	    else
		System.out.println("Not strong");
	}
}
