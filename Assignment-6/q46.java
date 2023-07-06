//Question-46


import java.util.*;
class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=String.valueOf(n);
		int size=s.length();
		int a=s.charAt(0)-'0';
		int b=s.charAt(size-1)-'0';
		System.out.print(a+b);
	}
}
