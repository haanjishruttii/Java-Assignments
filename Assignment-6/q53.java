//Question-53

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0,r,length,fact=1;
		String s;
		for(int i=n;i<=m;i++)
		{
		    s=String.valueOf(i);
		    length=s.length();
		    sum=0;
		    for(int j=0;j<length;j++)
		    {
		           r=s.charAt(j)-'0';
		           fact=1;
		           for(int k=2;k<=r;k++)
		           {
		               fact=fact*k;
		           }
		          sum+=fact;
		    }
		    if(sum==i)
		    {
		        System.out.println(i+" is Strong");
		    }
		    
		}
	}
}

