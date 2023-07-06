//Question-50

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int temp,reverse,r;
		for(int i=n;i<=m;i++)
		{
		    temp=i;
		    reverse=0;
		    while(temp>0)
		    {
		        r=temp%10;
		        reverse=reverse*10+r;
		        temp=temp/10;
		    }
		    if(reverse==i)
		    {
		        System.out.println(i+" is palindrome");
		    }
		    
		}
	}
}

