
// Question : 31

import java.util.Scanner;
class Main  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a;
        a=sc.nextFloat();
        System.out.println("Press 1 for fehrenheit to celcius and Press 2 for celcius to fehrenheit :");
        int temperature;
        temperature=sc.nextInt();
        switch(temperature)
        {
            case 1 : a=(a-32)*5/9;
            break;
            case 2 : a=(a*9/5)+32;
            break;
            default : System.out.println("Invalid");
            break;
        }
        System.out.print(a);
    }
}
