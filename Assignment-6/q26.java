//Question-26

import java.util.Scanner;
class Main{
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    int i,n;
	    n=sc.nextInt();
	    for(i=0; i<=n; i=i+2)
	    {
		System.out.println(i*i*i);
	    }
	}
}
