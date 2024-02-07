import java.util.Scanner;
class Employee{
	String name;
	int age;
	String phno;
	String address;
	int salary;

	
	Employee(String n,int a,String p,String adr,int sal){
		name = n;
		age = a;
		phno = p;
		address = adr;
		salary = sal;
	}
	
	void print_salary(){

		System.out.println("Salary of Employee is "+salary);
	}
	
	void display_details(){
		System.out.println("Name : "+name+"\n"+
				"Age :"+age+"\n"+
				"Phone Number :"+phno+"\n"+
				"Address : "+address);
	}
	
	
}

class Manager extends Employee{
	String department;
	Manager(String n,int a,String p,String adr,int sal,String dept){
		super(n,a,p,adr,sal);
		department = dept;
	}
	
	void display_details(){
		System.out.println("\nDetails of Manager\n");
		super.display_details();
		System.out.println("Department : "+department);
		
	}
	
}

class Officer extends Employee{
	String specialization;
	Officer(String n,int a,String p,String adr,int sal,String spcl){
		super(n,a,p,adr,sal);
		specialization = spcl;
	}
	
	void display_details(){
		System.out.println("\nDetails of Officer\n");
		super.display_details();
		System.out.println("Specialization : "+specialization);
		
	}
	
}

class inheritance2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name :");
		String name = sc.nextLine();	
		
		System.out.print("Enter Age :");
		int age = sc.nextInt();	
		sc.nextLine();
		
		System.out.print("Enter Phone Number :");
		String phno = sc.nextLine();	
		
		System.out.print("Enter Address :");
		String addr = sc.nextLine();	
			
	
			

		System.out.print("Enter Department As Manager :");
		String dept = sc.nextLine();
		
		System.out.print("Enter Salary As Manager:");
		int salary_manager = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Specialization As Officer :");
		String spcl = sc.nextLine();

		System.out.print("Enter Salary As Officer:");
		int salary_officer = sc.nextInt();
		

		
		
		
		Manager manager = new Manager(name,age,phno,addr,salary_manager,dept);
		Officer officer = new Officer(name,age,phno,addr,salary_officer,spcl);			
		manager.display_details();
		manager.print_salary();
		
		officer.display_details();
		officer.print_salary();
		
		
	}	
}

