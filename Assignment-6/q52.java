//Question-52

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0,r,length;
		String s;
		for(int i=n;i<=m;i++)
		{
		    s=String.valueOf(i);
		    length=s.length();
		    sum=0;
		    for(int j=0;j<length;j++)
		    {
		           r=s.charAt(j)-'0';
		        sum+=Math.pow(r,length);
		    }
		    if(sum==i)
		    {
		        System.out.println(i+" is Armstrong");
		    }
		    
		    
		}
	}
}

