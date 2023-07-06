//Question-10

import java.util.Scanner;
class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int i=1,a=0,n;
		n=sc.nextInt();
		while(i<=n)
		    {
		        if(i%2==0){
		           a=a+i;
		        }
		      i++;
		    }
		     System.out.println(a);
    }
}
