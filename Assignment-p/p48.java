/*  A
   AB
  A_C
 A__D
ABCDE  */
import java.util.Scanner;

class P48 {
    public static void main(String[] args) {
        char i, j, k;
        for (i = 65; i <= 69; i++) {
            for (k = 69; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 65; j <= i; j++) {
                if(i==69||j==65||i==j)
                System.out.print(j);
                else
                System.out.print("-");
            }
            System.out.println();
 }
}
}
