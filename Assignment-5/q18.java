//Question-18

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=1;
		int sum=0;
		System.out.println("Enter value of x : ");
		int x=sc.nextInt();
		
		while(n!=0)
		{
		    p=p*x;
		    sum=sum+p;
		    
		    n--;
		    
    	}
    	System.out.println(sum);
	}
}
