import java.util.Scanner;

class charcount {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String userstr = sc.nextLine();
		System.out.println("Enter character to Count :");
		char tosearch = sc.nextLine().charAt(0);
		
		int ctr = 0;
		
		for(int i = 0;i < userstr.length(); i++){
			if(userstr.charAt(i) == tosearch){
				ctr ++ ;
			}
		}
		
		System.out.println("Number of occurance of character "+tosearch+" is :"+ctr);
	}
	
}

