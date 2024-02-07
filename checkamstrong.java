import java.util.Scanner;

class checkamstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 digit number :");
		int num = sc.nextInt();
		int numcopy = num;
		int newnum = 0;
		do{
			int digit = num%10;
			newnum += (digit*digit*digit);
			num = num/10;
		}while(num>0);
	
		if(numcopy == newnum){
			System.out.println(numcopy+" is an amstrong number");
		}else{
			System.out.println(numcopy+" is not an amstrong number");
			
		}
	}
}
