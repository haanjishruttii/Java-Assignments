import java.util.Scanner;
class Loop1{
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
                if(i==4&&(j==2||j==3)||i==3&&j==2)
                {
                    System.out.print("_");
                }
            else
                System.out.print(j);
            }
                System.out.println();

         }

    }  
}
