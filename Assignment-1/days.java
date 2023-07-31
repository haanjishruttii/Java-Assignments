//Question:-18
import java.util.Scanner;
class Infobeans{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   int days,weeks,month;
	   System.out.println("Number of days=");
	   days=sc.nextInt();
	   month= days/30;
	   System.out.println("Days into Months & Days="+month+" months "+days%30+" days ");
	   weeks= days/7;
	   System.out.println("Days into Weeks & Days="+weeks+" weeks "+days%7+" days");
	   
	}
}	
