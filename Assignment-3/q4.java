//Question:4

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.println("Enter student's marks:-");
        marks=sc.nextInt();
        if(marks<25)
        {
            System.out.println("Below 25-F");
        }
        if(marks>=25&&marks<45)
        {
            System.out.println("25 to 45- E");
        }
        if(marks>=45&&marks<50)
        {
            System.out.println("45 to 50- D");
        }
        if(marks>=50&&marks<60)
        {
            System.out.println("50 to 60- C");
        }
        if(marks>=60&&marks<80)
        {
            System.out.println("6o to 80- B");
        }
        if(marks>=80)
        {
            System.out.println("Above 80-A");
        }
    }
}
