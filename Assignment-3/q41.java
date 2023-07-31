
// Question : 41

import java.util.Scanner;
class Main  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int physics,chemistry,bio,maths,computer;
        System.out.println("Physics : ");
        physics=sc.nextInt();
        System.out.println("Chemistry : ");
        chemistry=sc.nextInt();
        System.out.println("Biology : ");
        bio=sc.nextInt();
        System.out.println("Mathematic : ");
        maths=sc.nextInt();
        System.out.println("Computer : ");
        computer=sc.nextInt();
        int percentage;
        percentage=(physics+chemistry+bio+maths+computer)/5;
        
        System.out.println(percentage);
        if(percentage>=90)
        {
            System.out.println("Grade A");
        }else if(percentage>=80)
        {
            System.out.println("Grade B");
        }else if(percentage>=70)
        {
            System.out.println("Grade C");
        }else if(percentage>=60)
        {
            System.out.println("Grade D");
        }else if(percentage>=40)
        {
            System.out.println("Grade E");
        }else if(percentage<40)
        {
             System.out.println("Grade F");
        }
    }    
}
