import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        int i,space,j;
        for (i=1;i<=5;i++)
        {
            for(space=1;space<i;space++)
            {
                System.out.print(" ");
            }
            for(j=5;j>=i;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }  
}
