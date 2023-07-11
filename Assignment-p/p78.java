            //    *
            //   ***
            //  ***** 
            // ******* 
            //  ***** 
            //   *** 
            //    *

class Main{
    public static void main(String[] args) {
        int i,j,m,l,sp;
        for(i=1;i<=7;i++){
            for(sp=7;sp>=i;sp--){   
            System.out.print(" ");   
         }
            for(j=1;j<=i;j++){
                if(i%2!=0){
                System.out.print("* ");
            }
        }
            System.out.println();
        }
        for(l=6;l>=1;l--){
           
            for(sp=6;sp>=l;sp--){
                
            System.out.print(" ");   
         }
        
            for(m=1;m<=l;m++){
                if(l%2!=0){
                System.out.print("* ");
            }
        }
            System.out.println();
        }
    }
}
