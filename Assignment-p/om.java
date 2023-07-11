class Main
{
	public static void main(String[] args) {
	    char a[][]=new char[10][11];
	    for(int i=0; i<10; i++){
		    for(int j=0; j<11; j++){
		    a[i][j]=' ';
		
		    }
		    
		}
		a[0][3]='*';
		a[0][5]='*';
		a[0][8]='*';
		for(int i=4; i<=7; i++){
		a[1][i]='*';
		}
		a[2][4]='*';
		a[2][5]='*';
		a[3][3]='*';
		for(int i=3; i<=7; i++){
		    a[i][6]='*';
		}
		a[4][2]='*';
		a[5][7]='*';
		a[5][8]='*';
		a[6][1]='*';
		a[6][4]='*';
		a[6][5]='*';
		a[6][9]='*';
		a[7][0]='*';
		a[7][2]='*';
		a[7][6]='*';
		a[7][9]='*';
		a[8][3]='*';
		a[8][5]='*';
		a[8][9]='*';
		a[8][10]='*';
		a[9][4]='*';
		for(int i=0; i<10; i++){
		    for(int j=0; j<11; j++){
		    System.out.print(a[i][j]);
		
		    }
		    System.out.println();
		}
		
	}
}
