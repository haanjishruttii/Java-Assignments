    // 11111
    //  2222
    //   333
    //    44
    //     5

class Main{
    public static void main(String[] args) {
        int i,j,sp;
        for(i=1;i<=5;i++){
            for(sp=5-i;sp<=5;sp++){
                System.out.print(" ");
            }
            for(j=5;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
