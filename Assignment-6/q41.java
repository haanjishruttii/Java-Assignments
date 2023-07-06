//Question-41

import java.util.Scanner;
class Test{
	public static void main(String args[]){
	   Scanner sc=new Scanner (System.in);
	   System.out.println("Enter the value of x= ");
	   int x=sc.nextInt();
	   System.out.println("Enter the valur of y= ");
	   int y=sc.nextInt();
	   int max;
	   if(x>y)
	       max=x;
	   else
	       max=y;
	   for(int i=max; i<=x*y; i++)
	   {
               if((i%x==0)&&(i%y==0))
               {
	          System.out.println("LCM="+i);
		 break;}
	      }
	}
}
