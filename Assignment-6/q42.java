//Question-42

import java.util.Scanner;
class Test{
	public static void main(String args[]){
	   Scanner sc=new Scanner (System.in);
	   System.out.println("Enter the value of x= ");
	   int x=sc.nextInt();
	   System.out.println("Enter the valur of y= ");
	   int y=sc.nextInt();
	   int min;
	   if(x>y)
	       min=y;
	   else
	       min=x;
	   int z;
	   for(int i=1; i<=min; i++)
	   {
	       if((x%i==0)&&(y%i==0))
	       z=i;
	   }
	       System.out.println("HCF="+z);
			
	   }
	}
}
