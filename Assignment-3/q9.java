//Question:9

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          char A,a;
          System.out.println("Enter character : ");
          A=sc.next().charAt(0);
          //a=sc.next().charAt(0);
          if(A>=65 && A<=90)
          {
              System.out.println("Entered character is in uppercase");
          }
          else
          {
              System.out.println("Entered character is in lowercase");
          }
    }
}
