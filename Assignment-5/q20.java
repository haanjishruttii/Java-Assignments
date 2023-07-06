//Question-20

import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int i=101;
	    int j,count;
	    for(i=101; i<=199; i++)
	    {
	        count=0;
	        j=1;
	        while(j<=i)
	        {
	            if(i%j==0)
	            count++;
	            
	            j++;
	        }
	        if(count==2)
	        System.out.println(i);
	    }
		
	}
}
