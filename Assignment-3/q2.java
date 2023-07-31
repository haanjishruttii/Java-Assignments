//Queation:2
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Quantity;
        System.out.println("Enter Quantity of product:-");
        Quantity=sc.nextInt();
        float cost=Quantity*100;
        float discount=(cost*10)/100;
        if(cost>1000)
        {
            System.out.println("Discount 10%="+discount);
            System.out.println("Ammount after Discount="+(cost-(cost*10/100)));
        }
        else
        {
            System.out.println("Ammount="+cost);
        }
    }
}
