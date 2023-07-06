//Question-40

import java.util.Scanner;
class Main{
	public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int evencount = 0;
	   int oddcount = 0;
	   int temp = n;
	   while(n!=0)
	   {
		if(r%2==0)
		{
		    evencount++;
		}
		else
		{
		    oddcount++;
		}
		    n=n/10;
		}
	}
}	
