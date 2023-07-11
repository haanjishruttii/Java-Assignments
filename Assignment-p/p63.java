//      *
//     *_*
//    *___* 
//   *_____* 
//  *********

class Main{
    public static void main(String[] args) {
      for (int i = 0; i < 5; i++) {
        for (int k = 0; k< 5-i-1; k++) {
          System.out.print(" ");
        }
        for (int j = 0; j < 2*i+1; j++) {
          if(i==2&&(j==1||j==2||j==3)||i==1&&j==1||i==3&&(j==1||j==2||j==3||j==4||j==5)){
              System.out.print("_");
          }
          else
          System.out.print("*");
        }
        System.out.println();
  }
  }
  }
