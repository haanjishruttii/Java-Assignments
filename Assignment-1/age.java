//Question:_3
import java.util.Scanner;
class Infobeans{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   int age=sc.nextInt();
	   System.out.println("Age of person="+age);
	   String S=(age>18)?"Elligible":"Not Elligible";
	   System.out.println(S);
	}
}
