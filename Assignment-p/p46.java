/*  A
   AB
  ABC
 ABCD
ABCDE */
import java.util.Scanner;
      class P46{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            char ch='A';
            for(int sp=5-i;sp>=1;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


}
      }
