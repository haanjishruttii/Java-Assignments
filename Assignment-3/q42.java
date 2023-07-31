
// Question : 42

import java.util.Scanner;
class Main  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float bs,hra,hra1,hra2,hra3,da,da2,da3,da1,grosssalary;
        System.out.println("Enter basic salary : ");
        bs=sc.nextInt();
        hra1=bs*20/100f;
        hra2=bs*25/100f;
        hra3=bs*30/100f;
        hra=hra1+hra2+hra3;
        da1=bs*80/100f;
        da2=bs*90/100f;
        da3=bs*95/100f;
        da=da1+da2+da3;
        if(bs<=10000)
        {
            System.out.println("HRA="+hra1);
            System.out.println("D.A.="+da1);
        }
        else if(bs<=20000)
        {
            System.out.println("HRA="+hra2);
            System.out.println("D.A.="+da2);
        }
        else if(bs>20000)
        {
            System.out.println("HRA="+hra3);
            System.out.println("D.A."+da3);
        }
        grosssalary=bs+hra+da;
        System.out.println("Gross Salary="+grosssalary);
     }    
}
