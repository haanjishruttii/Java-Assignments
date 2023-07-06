class Main{
	public static void main(String args[]){
	for(int i=5; i>=0; i--){
		for(int j=1; j<=i; j++){
		if(i==3&&j==2||i==4&&j==2||i==4&&j==3)
		System.out.print(" ");
		else
		System.out.print("*");
		}
		System.out.println();
		}
	}
}
