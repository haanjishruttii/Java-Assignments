//Question-48

import java.util.Scanner;
class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n;i<=m;i++)
		{
		    System.out.print("Factor of "+i+" are: ");
		    for(int j=1;j<=i;j++)
		    {
		        if(i%j==0)
		        {
		            System.out.print(j+", ");
		        }
		    }
		    System.out.println();
		}
	}
}
