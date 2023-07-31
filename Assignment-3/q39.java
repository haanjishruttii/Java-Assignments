// Question : 39

import java.util.Scanner;
class Main  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount : ");
        int a= sc.nextInt();
        int fh,twoh,hun,fif,twen,ten,fiv;
        fh=a/500;
        a=a%500;
        twoh=a/200;
        a=a%200;
        hun=a/100;
        a=a%100;
        fif=a/50;
        fif=a%50;
        twen=a/20;
        a=a%20;
        ten=a/10;
        a=a%10;
        fiv=a/5;
        a=a%5;
        System.out.println(fh+" = notes of 500");
        System.out.println(twoh+" = notes of 200");
        System.out.println(hun+" = notes of 100");
        System.out.println(fif+" = notes of 50");
        System.out.println(twen+" = notes of 20");
        System.out.println(ten+" = notes of 10");
        System.out.println(fiv+" = notes of 5");
      }    
}
