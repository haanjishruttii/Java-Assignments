        //       *
        //      *_* 
        //     *___* 
        //    *_____*
        //     *___* 
        //      *_*
        //       *
 

    class Main{
        public static void main(String[] args) {
            int i,j,sp;
            for(i=1;i<=7;i++){
                for(sp=7;sp>=i;sp--){  
                     
                System.out.print(" ");   
             }
                for(j=1;j<=i;j++){
                    if(i%2!=0){
                        if((i==3&&j==2)||i==5&&(j==2||j==3||j==4)||i==7&&(j==2||j==3||j==4||j==5||j==6)){
                            System.out.print("_ ");
                        }
                        else{
                    System.out.print("* ");
                        }
                }
            }
                System.out.println();
            }
            for(i=6;i>=1;i--){
               
                for(sp=6;sp>=i;sp--){
                    
                System.out.print(" ");   
             }
            
                for(j=1;j<=i;j++){
                    if(i%2!=0){
                        if(i==5&&(j==2||j==3||j==4)||i==3&&j==2){
                            System.out.print("_ ");
                        }
                        else{
                    System.out.print("* ");
                }
            }
            }
                System.out.println();
            }
        }
    }
