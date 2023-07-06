//Question-36

import java.uti.Scanner;
class Main{
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    int r, reverse=0,n;
	    n=sc.nextInt();
	    while(n>0){
		r=n%10;
		reverse=(reverse*10)+r;
		n=n/10;
	    }
		System.out.println("reverse="+reverse);
	}
}
