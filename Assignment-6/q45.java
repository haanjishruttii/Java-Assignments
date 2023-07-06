//Question-45


import java.util.Scanner;
class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=0;
		while(n>0)
		{
		    result+=n%10;
		    n=n/10;
		}
		System.out.print(result);
	}
}


