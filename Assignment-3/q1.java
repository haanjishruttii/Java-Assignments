//Question:1
import java.util.Scanner;
class Main{
    public static void main(String args []){
      Scanner sc=new Scanner(System.in);
      float length,breadth;
      System.out.println("Enter length of figure=");
      length=sc.nextFloat();
      System.out.println("Enter breadth of figure=");
      breadth=sc.nextFloat();
      if(length==breadth)
      {
          System.out.println("It is a square");
      }
      else
      {
          System.out.println("It is a rectangle");
      }
    }
}
