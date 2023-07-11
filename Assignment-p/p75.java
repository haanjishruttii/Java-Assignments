
//     1
//    12
//   123
//  1234
//   123
//    12
//     1

class Main{
    public static void main(String[] args) {
        int i,j,l,m;
        
        for(i=1;i<=4;i++){
        for(int sp=4-i;sp>=1;sp--){
                 System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(l=3;l>=1;l--){
            for(int sp=1;sp<=4-l;sp++){
                System.out.print(" ");
           }
            for(m=1;m<=l;m++){
                System.out.print(m);
            }
        
            System.out.println();
        }
           }
           
    
}
