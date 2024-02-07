import java.util.Scanner;
class monthdays{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month ");
		
		String month = sc.nextLine();
		System.out.println("Enter Current year :");
		int year = sc.nextInt();
		month = month.toLowerCase();
		int days;
		
		switch(month){
			case "january":
			case "march":
			case "may":
			case "july":
			case "august"
			case "september":
			case "november":
				days = 31;
				break;
			case "february":
				if(year%4==0 && year%100 != 0){
					days = 29;
				}else if(year%400 == 0){
					days = 29;
				}else{
					days = 28;
				}
				break;
			default:
				days = 30;
				break;
				
		}
		
		System.out.println("There are "+days+" days in "+ month);
		
	}
}
