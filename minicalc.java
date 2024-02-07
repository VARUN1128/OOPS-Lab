import java.util.Scanner;

class minicalc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number :");
		int num2 = sc.nextInt();
		
		System.out.println("Sum :"+(num1+num2));
		System.out.println("Difference :"+(num1-num2));
		System.out.println("Product :"+(num1*num2));
		System.out.println("Quotient :"+(float)num1/num2);
		System.out.println("Reminder :"+(num1%num2));


	}

}
