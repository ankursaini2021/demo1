import java.util.Scanner;
class demo1{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in); 
	int[][] a=new int[5][];
	for(int i=0;i<a.length;i++){
		
		a[i]=new int[i+1];
		
	}
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[i].length;j++){
			System.out.print("enter the element no a["+i+"]["+j+"]:  ");
			a[i][j]=sc.nextInt();	
			System.out.println();
		}
		
	}
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[i].length;j++){
			System.out.print(a[i][j]+" ");	
		}
		System.out.println();
	}
}
}