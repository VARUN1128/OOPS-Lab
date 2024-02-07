class ExceptionHandlingOne {
	public static void main(String args[]){
		try {
			System.out.println("Trying "+args[0]+"/"+args[1]);
			int test = Integer.parseInt(args[0])/Integer.parseInt(args[1]);
			System.out.println("Result is :"+test);
				
		} catch(ArithmeticException e){
			System.out.println("Got Arithmetic Exception :"+e);
		}
		
		try {
			int array[] = {1,2,3,4,5};
			for(int i = 0;i<=6;i++){
				System.out.println("Index : "+i+" Element :"+array[i]);

			}
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index Iterated Out of range\nExiting catch");
			
		}
		
		finally{
			System.out.println("Reached The finally Block after All Try-Catch Statements");
		}
		
		System.out.println("Completed All Try Catch and Finally Blocks");
	}
}
