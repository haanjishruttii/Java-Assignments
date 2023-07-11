class Main{
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=7;i++){
            for(j=1;j<=7;j++){
              if((i<=7&&j==1)||(i==1&&j<=7)||(i==7&&j<=7)||(i==j)||((i==2||i<=6)&&j==7)||(i==2&&j==6)||(i==3&&j==5)||(i==5&&j==3)||(i==6&&j==2)){

                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
          
        }
        System.out.println();
        }
    }
}
