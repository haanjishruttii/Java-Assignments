//Question 17:-
import java.util.Scanner;
class Infobeans{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	float n,p;
	System.out.println("Enter the height of person in inches=");
	n=sc.nextFloat();
	p=n*2.54f;
	System.out.println("Height of the person into cm="+p);
	}
}
