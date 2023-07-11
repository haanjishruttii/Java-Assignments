// *         *
// **       **
// ***     ***
// ****   ****
// ***** *****
class P84{
    public static void main(String[] args) {
        int i,j;
        for(i=5;i>=1;i--){
            for(j=9;j>=1;j--){
              if(j<=6-i||j>=4+i)
              System.out.print("*");
              else
              System.out.print(" ");
            }
            
            System.out.println();
         }
    }
}
