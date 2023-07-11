class Main{
    public static void main(String[] args) {
        int i,j,sp;
        for (i=1;i<=9;i++)
        {
            for(sp=9-i;sp>=1;sp--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                if(i%2!=0)
                {
                System.out.print(j+" ");
                }
            }
         
        System.out.println();
        }
    }
  
}
