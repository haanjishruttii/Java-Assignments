import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		for(int i=1; i<=15; i++){
		    for(int j=1; j<=15; j++){
		        if(i==8||j==8||j==1&&(i==1||i==2||i==3||i==4)||i==1&&(j==6||j==7||j==8||j==9)||i==9&&(j==1||j==2||j==3||j==4)||j==9&&(i==6||i==7||i==8||i==9))
		        System.out.print("*");
		        else
		        System.out.print(" ");
		        //if(j==1&&(i==1||i==2||i==3||i==4))
		    }
		    System.out.println();
		}
	}
}

