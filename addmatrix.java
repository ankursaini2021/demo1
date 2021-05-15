class admatrix{
public static void main(String args[]){
	
	int a[][]={{05,06,85},{15,20,32},{56,25,05}};
	int b[][]={{06,154,25,78},{06,58,21},{95,62,34}};
	int c[][]=new int[3][3]; 
	System.out.println("array matrix 1 is:  ");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.print(a[i][j]+"   ");
		}
		System.out.println();
	}
	System.out.println("array matrix 2 is :  ");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.print(b[i][j]+"   ");
		}
		System.out.println();
	}
	
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			c[i][j]=a[i][j]+b[i][j];
		}
		
	}
	System.out.println(" addition of matrix is :  ");
	System.out.println();
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.print(c[i][j]+"   ");
		}
		System.out.println();
	}
	
}

}