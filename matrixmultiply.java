import java.util.Scanner;

class matrixmultiply {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Matrix 1");
		System.out.println("Enter number of Rows:");
		int i = sc.nextInt();
		System.out.println("Enter number of Column:");
		int j = sc.nextInt();
		int matrix1[][] = new int[i][j];
		System.out.println("Matrix 2");
		System.out.println("Enter number of Rows:");
		int p = sc.nextInt();
		System.out.println("Enter number of Column:");
		int q = sc.nextInt();
		int matrix2[][] = new int[p][q];
		if(j != p){
			System.out.println("Not Possible Broh");
			return;
		}
		System.out.println("Matrix - 1");
		for(int m = 0;m<i;m++){
			for(int n = 0;n<j;n ++){
				System.out.println("Enter element at "+m+" "+n);
				matrix1[m][n] = sc.nextInt();
			}
		}		
		System.out.println("Matrix - 2");
		for(int m = 0;m<i;m++){
			for(int n = 0;n<j;n ++){
				System.out.println("Enter element at "+m+" "+n);
				matrix2[m][n] = sc.nextInt();
			}
		}
		
		int newmatrix[][] = new int[i][q];
		
		for(int m = 0;m<i;m++){
			for(int n = 0;n<q;n++){
				for(int k =0;k<p;k++){
					newmatrix[m][n] += matrix1[m][k]*matrix2[k][n];
				}
			}
		}
		System.out.println("Matrix - 1");
		for(int m = 0;m<i;m++){
			for(int n = 0;n<j;n++){
				System.out.print(matrix1[m][n]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix - 2");
		for(int m = 0;m<p;m++){
			for(int n = 0;n<q;n++){
				System.out.print(matrix2[m][n]+" ");
			}
			System.out.println();
		}
		
		System.out.println("New Matrix");
		for(int m = 0;m<i;m++){
			for(int n = 0;n<q;n++){
				System.out.print(newmatrix[m][n]+" ");
			}
			System.out.println();
		}
	}
}
