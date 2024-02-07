import  java.util.Scanner;

class checkpallindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int numcpy = num;
		int newnum = 0;
		while(num > 0){
			
			int digit = num%10;
			newnum = (newnum * 10) + digit;
			num = num/10;
		}
		if(newnum == numcpy){
			System.out.println("The number is pallindrome");
		}else{
			System.out.println("The number is not pallindrome");
		}
		
		
	}
}
