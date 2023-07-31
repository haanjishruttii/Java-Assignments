
// Question : 18

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float marks,percentage,subjects;
        System.out.println("Enter total marks of student=");
        marks=sc.nextFloat();
        System.out.println("Enter number of subjects");
        subjects=sc.nextFloat();
        percentage=marks/subjects;
        System.out.println("Student's percentage="+percentage);
        }
}
