//Question:-15
import java.util.Scanner;
class Infobeans{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the letter=");
	   char a=sc.next().charAt(0);
	   String s=((a>=65) && (a<99))?"uppercase":"lowercase";
	   System.out.println("Entered character is in:-"+s);
	}
}
