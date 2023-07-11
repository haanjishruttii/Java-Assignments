// 1
// 1 2
// 1  3
// 1   4
// 1  3
// 1 2
// 1

class Main{
    public static void main(String[] args) {
        int i,j=1,l,m,sp;
        for(i=1;i<=4;i++){
            
         for(j=1;j<=i;j++){
            if(i==3&&j==2||i==4&&(j==2||j==3)){
                System.out.print(" ");
            }
            else{

                System.out.print(j);
            }
        }
        System.out.println();
        }
        
        for(l=3;l>=1;l--){
            for(m=1;m<=l;m++){
                if(l==3&&m==2){
                    System.out.print(" ");
                }
                else{
                    System.out.print(m);
                    
                }
            }
        
            System.out.println();
        }
    }
}
