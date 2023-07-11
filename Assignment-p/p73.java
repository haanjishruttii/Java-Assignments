        // 123456789
        //  1+++++7
        //   1+++5
        //    1+3
        //     1

class Main{
    public static void main(String[] args) {
        int i,j=0,sp;
       
        for (i=9;i>=1;i--){
            for(sp=9-i;sp>=1;sp--){
            
            System.out.print(" ");
                
            }
            for(j=1;j<=i;j++){
             if(i%2!=0){
                if(i==7 && (j==2 || j==3 || j==4 || j==5 || j==6) || i==5 &&(j==2 || j==3 || j==4) || i==3 && j==2){
                    System.out.print("+ ");
                }
                else{
                
                    System.out.print(j+ " ");
                }
         }
        }
            System.out.println();
        }
    }
}
