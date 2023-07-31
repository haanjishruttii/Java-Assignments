import java.util.Scanner;
class Dmart{
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Name:-");
	  String name=sc.nextLine();
	  //System.out.print("Gender:-");
	  //String gender=sc.nextLine();
	  float a1p, a2p, a3p, a4p, a5p, a6p, a7p, a8p, a9p, a10p;
	  //int Q= a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
	  System.out.print("Item 1: ");
	  String Item1=sc.nextLine();
	  System.out.print("Quantity: ");
	  int a1=sc.nextInt();
	  a1p=10*a1;
	  System.out.println("Price: "+a1p);
	  System.out.println("Item 2: ");
	  String Item2=sc.next();
	  System.out.println("Quantity: ");
	  int a2=sc.nextInt();
	  a2p=20*a2;
	  System.out.println("Price: "+a2p); 
	  System.out.println("Item 3: ");
	  String Item3=sc.next();
	  System.out.println("Quantity: ");
	  int a3=sc.nextInt();
	  a3p=30*a3;
	  System.out.println("Price: "+a3p);
	  System.out.println("Item 4: "); 
	  String Item4=sc.next();
	  System.out.println("Quantity: ");
	  int a4=sc.nextInt();
	  a4p=40*a4;
	  System.out.println("Price: "+a4p);
	  System.out.println("Item 5: ");
	  String Item5=sc.next();
	  System.out.println("Quantity: ");
	  int a5=sc.nextInt();
	  a5p=50*a5;
	  System.out.println("Price: "+a5p);
	  System.out.println("Item 6: ");
	  String Item6=sc.next();
	  System.out.println("Quantity: ");
	  int a6=sc.nextInt();
	  a6p=60*a6;
	  System.out.println("Price: "+a6p);
	  System.out.println("Item 7: ");
	  String Item7=sc.next();
	  System.out.println("Quantity: ");
	  int a7=sc.nextInt();
	  a7p=70*a7;
	  System.out.println("Price: "+a7p);
	  System.out.println("Item 8: ");
	  String Item8=sc.next();
	  System.out.println("Quantity: ");
	  int a8=sc.nextInt();
	  a8p=80*a8;
	  System.out.println("Price: "+a8p);
	  System.out.println("Item 9: ");
	  String Item9=sc.next();
	  System.out.println("Quantity: ");
	  int a9=sc.nextInt();
	  a9p=90*a9;
	  System.out.println("Price: "+a9p);
	  System.out.println("Item 10: ");
	  String Item10=sc.next();
	  System.out.println("Quantity: ");
	  int a10=sc.nextInt();
	  a10p=100*a10;
	  System.out.println("Price: "+a10p);
	  float D1=0,D5,D10,ADP;
	  if(a1>4){
	  D1=(a1p-(a1p*5)/100f);
	     System.out.println(D1);
	     }System.out.println("---");
	  D5=(a5p-(a5p*10)/100f);
	  System.out.println(D5);
	  D10=(a10p-(a10p*15)/100f);
	  System.out.println(D10);
	  float Total=a1p+a2p+a3p+a4p+a5p+a6p+a7p+a8p+a9p+a10p;
	  ADP=(D1+a2p+a3p+a4p+D5+a6p+a7p+a8p+a9p+D10);
	  System.out.println(Total);
	  float TD,TD1,TD2;
	  TD1=(Total-(Total*15)/100f);
	  TD2=(Total-(Total*10)/100f);
	  TD=TD1; TD=TD2;
	  if(Total>10000){
	    System.out.println(TD1);
	    }System.out.println("---");
	  if((Total>5000)&&(Total<=10000)){
	    System.out.println(TD2);
	    }System.out.println("---");
	  float GST=(Total*10)/100f;
	  System.out.println(GST);
	  System.out.println("Do you want a carry bag Y/N");
	  char required;
	  String bag;
	  float carry;
	  required=sc.next().charAt(0);
	  if((required=='y')||(required=='Y'))
	  {bag="yes"; carry=10f;
	  }else{
	    bag="No"; carry=0;
	    }
	  char gender,f,F;
	  System.out.println("Gender:-");
	  String gift;
	  gender=sc.next().charAt(0);
	  if((gender=='f')||(gender=='F'))
	  {gift="cadberry";
	    }else{gift="Ladger wallet";}
	    
	    System.out.println("\t\t\t   D-Mart\t\t\t\t");
	    System.out.println("Name : "+name+"\t\t\t\t Date : 12/09/2022");
	    System.out.println("-------------------------------------------------------------------------------");
	    System.out.println("Item name "+"   Quantity"+"   Price"+"   Total"+"   After-Discount");
	    System.out.println((Item1)+"\t\t"+a1+"\t10"+"\t"+a1p+"\t"+D1);
	    System.out.println((Item2)+"\t\t"+a2+"\t20"+"\t"+a2p+"\t"+a2p);
	    System.out.println((Item3)+"\t\t"+a3+"\t30"+"\t"+a3p+"\t"+a3p);
	    System.out.println((Item4)+"\t\t"+a4+"\t40"+"\t"+a4p+"\t"+a4p);
	    System.out.println((Item5)+"\t\t"+a5+"\t50"+"\t"+a5p+"\t"+D5);
	    System.out.println((Item6)+"\t\t"+a6+"\t60"+"\t"+a6p+"\t"+a6p);
	    System.out.println((Item7)+"\t\t"+a7+"\t70"+"\t"+a7p+"\t"+a7p);
	    System.out.println((Item8)+"\t\t"+a8+"\t80"+"\t"+a8p+"\t"+a8p);
	    System.out.println((Item9)+"\t\t"+a9+"\t90"+"\t"+a9p+"\t"+a9p);
	    System.out.println((Item10)+"\t\t"+a10+"\t100"+"\t"+a10p+"\t"+D10);
	    System.out.println("------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\tA.P.\tD.P");
	    System.out.println("\t\t\t\t"+Total+"\t"+ADP);
	    System.out.println("Gift:-"+gift+"\t0.00\t0.00\t0.00");
	    System.out.println("\nCarry bag:-"+bag+"\t\t"+carry+"\t"+carry+"\t"+carry);
	    System.out.println("GST (10%)\t\t\t"+GST+"\t"+GST);
	    System.out.println("-----------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t"+(Total+carry+GST)+"\t"+(ADP+carry+GST)+  "Rs.");
	    System.out.println("\t\tThank You\n\t\tTo Visit\n\t\tD-Mart");
	  }
}
	     
	    
	   
	  
	     
	
	  
	  
 

	  
