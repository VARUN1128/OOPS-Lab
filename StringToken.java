import java.util.*;

class StringToken{
	public static void  main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Integer String :");
		String nums = sc.nextLine();
		StringTokenizer st = new StringTokenizer(nums," ");
		int sum = 0;
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			sum += Integer.parseInt(token);
			System.out.println(token);
		}
		System.out.println("Sum is :"+sum);
	}
}

