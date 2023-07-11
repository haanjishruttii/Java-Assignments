// A B C D E
//  A B C D
//   A B C
//    A B
//     A

class Main{
    public static void main(String[] args) {
        int i,j;
        int sp;
        for(i=1;i<=5;i++){
            char ch='A';

            for(sp=5-i;sp<=5;sp++){
                 System.out.print(" ");
            }
            for(j=5;j>=i;j--){
                
                System.out.print(ch+" ");
                ch++;
            
        }
        System.out.println();
    }
    }
}
