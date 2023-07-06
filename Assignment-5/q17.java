//Question-17

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x : ");
		int x=sc.nextInt();
		System.out.println("Enter value of y : ");
		int y=sc.nextInt();
		int p=1;
		while(y>=1)
		{
		    p=p*x;
	         }   y--;
          System.out.println(p);
	}
}
