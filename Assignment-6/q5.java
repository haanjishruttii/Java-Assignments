//Question-5

import java.util.Scanner;
class Main{
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    int n;
	    n=sc.nextInt();
	    int a=1;
	    for(int i=1; i<=n; i++)
	    {
		System.out.println(a=a*i);
	    }
	}
}
