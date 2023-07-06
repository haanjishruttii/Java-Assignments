//Question-59

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		n=n-n%9+9;
		for(int i=n;i<=m;i=i+9)
		{
		    System.out.println(i);
		}
	}
}
