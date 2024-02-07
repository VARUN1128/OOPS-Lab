class InvalidAgeException extends Exception {

	InvalidAgeException(String msg){
		super(msg);
	}
}



class ExceptionHandlingThree {
	public static void main(String args[]){
		int age = Integer.parseInt(args[0]);
		try{
			checkAge(age);
		}
		catch(InvalidAgeException e){
			System.out.println("There is an error with the age given :\n"+e.toString());
		}
	}
	
	static void checkAge(int age) throws InvalidAgeException{
		if(age >= 18){
			System.out.println("Age Requirement is Satisfied");
			}else {
				throw new InvalidAgeException("Age Must Be Greater Than 18");
			}
	}
}
