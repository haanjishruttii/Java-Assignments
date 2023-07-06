class Main{
	public static void main(String args[]){
	for(int i=1; i<=6; i++){
                  int k=7-i;
		for(int j=1; j<=7-i; j++,k--){
		if(i%2!=0)
		System.out.print(j);
		else
		System.out.print(k);
		}
		System.out.println();
		}
	}
}
