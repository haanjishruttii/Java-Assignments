
//Question-25

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int n=sc.nextInt();
		double sum=0;
		int f=1;
		while(n>0)
		{
		    f=f*x;
		    sum=sum+(double)1/f;
		    
		    n--;
		}
		System.out.println(sum);
	}
}
