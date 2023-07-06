import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        int i,j;
        int sp;
        for (i=1;i<=5;i++)
        {
           char ch='A';
           for(sp=5-i;sp>=1;sp--)
           {
               System.out.print(" ");
           }
           for(j=1;j<=i;j++)
           {
               System.out.print(ch+" ");
               ch++;
           }
           System.out.println();
         }

    }
}
