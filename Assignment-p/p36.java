class Main{
	public static void main(String args[]){
	for(char i=69; i>=65; i--){
		for(char j=65; j<=i; j++){
		if(i==67&&j==66||i==68&&j==66||i==68&&j==67)
		System.out.print(" ");
		else
		System.out.print(j);
		}
		System.out.println();
		}
	}
}
