// Question : 44

import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the choice (+) for addition, > for finding the greater number): ");
        char choice = sc.next().charAt(0);
        if(choice == '+')
        {
            int sum= n1+n2;
            System.out.println("Sum: "+ sum);
        }
        else if (choice == '>')
        {
            if(n1>n2)
            {
                System.out.println(n1+" is greater than "+n2);
            }
            else if(n2 > n1)
            {
                System.out.println(n2 +" is greater than "+n1);
            }
            else
            {
                System.out.println("Both numbers are equal");
            }
            }
            else
            {
                System.out.println("Invalid choice!");
        }
    }
}

