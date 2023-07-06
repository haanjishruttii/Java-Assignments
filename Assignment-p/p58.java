import java.util.Scanner;
class Main{
      public static void main(String[] args) {
         int i,j,sp;
         for (i=1;i<=5;i++)
         {
             for(sp=5-i;sp>=1;sp--)
             {
                 System.out.print(" ");
             }
             for(j=1;j<=i;j++)
             {
                 System.out.print(j+" ");
             }
         System.out.println();
         }
     }
}
