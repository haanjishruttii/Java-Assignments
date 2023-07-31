
//Queation:8

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
        System.out.println(attendencepercent);
        System.out.println("Do you have any medical cause Y/N");
        char medical=sc.next().charAt(0);
        if(attendencepercent>75 || medical=='y'||medical=='Y')
        {
            System.out.println("Student is allowed to sit in Exam");
        }
        else
        {
            System.out.println("Student is not allowed to sit in Exam");
        }
     }
}
