//     1
//     2
//     3
//     4
// 123454321
//     4
//     3
//     2
//     1
class Main{
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=4;i++){

            for(j=1;j<=5;j++){
                if(i==5||j==5)
                System.out.println(j);
              else
              System.out.println(" ");
            }
        
        }
       System.out.println("123454321");
       for(i=4;i>=1;i--){
        for(j=4;j>=1;j--){
            if(i==5||j==5)
            System.out.println(j);
            else
            System.out.println(" ");
        }
        System.out.println();
       }
    }
}
