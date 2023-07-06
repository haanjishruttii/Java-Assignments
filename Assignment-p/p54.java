import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        char i, j;
        int  k;
        for (i = 69; i >= 65; i--) 
        {
            for (k = 69; k >= i; k--) 
            {
                System.out.print(" ");
            }
            for (j = 65; j <= i; j++) 
            {
                if(i==69||j==65||i==j)
                    System.out.print(j);
                else
                    System.out.print("-");
            }
                System.out.println();
        }
    }
}
