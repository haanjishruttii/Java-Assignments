class Main{
	public static void main(String args[]){
	char c=97;
	for(char i=97; i<=101; i++){
		for(int j=97; j<=i; j++){
	if((i==99&&j==98)||(i==100&&j==98)||(i==100&&j==99))
         System.out.print(" ");
         else
         System.out.print(c++);
	}
	System.out.println();
	}
	}
}
