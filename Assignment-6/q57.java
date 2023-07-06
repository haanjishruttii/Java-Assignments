//Question-57

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n==1)
		{
		    n=2;
		}
		int flag;
		for(int i=n;i<=m;i++)
		{
		    flag=0;
		    for(int j=2;j<i;j++)
		    {
		        if(i%j==0)
		        {
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0)
		    {
		        System.out.println(i+" is Prime");
		    }
		}
	}
}

