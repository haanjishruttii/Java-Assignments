//      1
//     212
//    32123
//   4321234
//  543212345

class Main{
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(int sp=1;sp<=4;sp++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
