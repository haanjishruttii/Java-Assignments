//Question:19
import java.util.Scanner;
class Infobeans{
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the character:-");
	   char a=sc.next().charAt(0);
	   String s= ((a=='a') || (a=='e') || (a=='i') || (a=='o') || (a=='u') || (a=='A') || (a=='E') || (a=='I') || (a=='O') || (a=='U'))?"vowel":"consonent";
	   System.out.println("The given character is:"+s);
	}
}   
