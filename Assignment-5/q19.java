//Question-19

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float n=sc.nextInt();
		float fact=1;
		float sum=0;
		float div=0;
		
		for(int i=1; i<=n; i++)
		{
		    fact=fact*i;
		    div=i/fact;
		    sum=sum+div;
    	}
    	System.out.println(sum);
	}
}
