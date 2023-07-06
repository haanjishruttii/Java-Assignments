import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        int i,space,j;
        for (i=5;i>=1;i--)
        {
            for(space=i;space<=4;space++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }  
}
