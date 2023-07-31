
// Question : 28


import java.util.Scanner;
class Main{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n1,n2,operator;
	    System.out.println("Enter first number : ");
	    n1=sc.nextInt();
	    System.out.println("Enter second number : ");
	    n2=sc.nextInt();
	    System.out.println("1-Addition \n2-Subtraction \n 3-Multiplication \n 4-Division");
	    System.out.println("Choose the operator : ");
	    operator=sc.nextInt();
	    int result=0;
	    switch(operator)
	    {
	        case 1 : result=n1+n2;
	        break;
	        case 2 : result= n1-n2;
	        break;
	        case 3 : result=n1*n2;
	        break;
	        case 4 :
	            if(n2==0)
	            {
	                System.out.println("Invalid");
	                break;
	            }
	            result=n1/n2;
	        break;
	        default: System.out.println("Invalid operator");
	        break;
	    }
	    System.out.println("Result="+result);
	}
}
