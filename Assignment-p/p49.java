/*   1
    10
   101
  1010
 10101  */
 import java.util.Scanner;
 class Main{
    public static void main(String[] args) {
        int i,j,space;
        for (i=1;i<=5;i++){
         for(space=4;space>=i;space--){
               System.out.print(" ");
            } 
            for(j=1;j<=i;j++){
                if(j%2==1){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                } 
            }
           System.out.println();
        }
    }
}
