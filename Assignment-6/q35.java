//Question-35

import java.util.Scanner;
class Main{
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    int n;
	    n=sc.nextInt();
	    while(n!=0)
	    {
		n=n/10;
		count++;
	    }
		System.out.println(count);
		
	}
}
