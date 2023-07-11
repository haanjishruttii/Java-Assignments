/*    1
     11
    1*1
   1**1
  11111 */
  import java.util.Scanner;
  class P47{
public static void main(String[] args) {
    int i,space,j;
    for(i=1;i<=5;i++){
      for(space=4;space>=i;space--){
           System.out.print(" ");
        } 
      for(j=1;j<=i;j++){
          if(i==3&&j==2||i==4&&(j==2||j==3)){
            System.out.print("*");
          }
          else{
            System.out.print("1");
          }
        }  System.out.println();
        
        }
  }  
}
