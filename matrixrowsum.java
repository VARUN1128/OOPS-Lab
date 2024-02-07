import java.util.Scanner;

class matrixrowsum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Rows:");
		int m = sc.nextInt();
		System.out.println("Enter number of Column:");
		int n = sc.nextInt();
		int matrix1[][] = new int[m][n];
		
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j ++){
				System.out.println("Enter element at "+i+" "+j);
				matrix1[i][j] = sc.nextInt();
			}
		}	
		
		int rowsums[] = new int[m];
	 	int colsums[] = new int[n];
	 	
	 	for(int i=0;i<m;i++){
	 		for(int j = 0;j<n;j++){
	 			rowsums[i] += matrix1[i][j];

	 			colsums[j]+= matrix1[j][i];
	 		}
	 	}
	 	

	 	 
	 	for(int i = 0;i<m;i++){
	 		System.out.println("Row "+(i+1)+" = "+rowsums[i]);
	 	}

	 	for(int j = 0;j<n;j++){
	 		System.out.println("Column "+(j+1)+" = "+colsums[j]);
	 	}
	}
}
