
// Question :7

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float classesheld,classattended,attendencepercent;
        System.out.println("No of classes held=");
        classesheld=sc.nextFloat();
        System.out.println("No of class attended=");
        classattended=sc.nextFloat();
        attendencepercent=(classattended*100f/classesheld);
        System.out.println("Attendence percent="+attendencepercent);
        if(attendencepercent>75)
        {
            System.out.println("Student is allowed to sit in Exam");
        }
        else
        {
            System.out.println("Student is not allowed to sit in Exam");
        }
     }
}
