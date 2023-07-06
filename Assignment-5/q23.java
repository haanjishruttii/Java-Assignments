
//Question-23

import java.util.Scanner;
class Main
{
    
    static int count(int n)
    {
        int c=0;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        return c;
    }
    
    static int power(int n,int p)
    {
        int result=1;
        for(int i=0;i<p;i++)
        {
            result=result*n;
        }
        return result; 
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int a=101,b=999;
	    int length;
	    int sum=0;
	    int n,r;
	    for(int i=a;i<=b;i++)
	    {
	   
	    n=i;
	    length=count(i);
	    sum=0;
	    while(n>0)
	    {
	        r=n%10;
	        n=n/10;
	        sum=sum+power(r,length);
	    }
	        
	        if(sum==i)
	        {
	            System.out.println(i);
	        }
	    }
	    
	}
}
