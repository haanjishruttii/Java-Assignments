
//Question-24

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0;
		while(n>0)
		{
		    sum=sum+(double)1/n;
		    
		    n--;
		}
		System.out.println(sum);
	}
}
