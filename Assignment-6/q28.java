//Question-28

import java.uti.Scanner;
class Main{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   int i,n;
	   n=sc.nextInt();
	   for(i=1; i<=n; i++)
	   {
		if(i%5==0)
		{
		   System.out.println("Hello");
		}
		else
		{
		   System.out.println(i);   
		}
	   }
	}
}
