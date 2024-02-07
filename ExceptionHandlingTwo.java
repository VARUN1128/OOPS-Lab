class ExceptionHandlingTwo {
	public static void main(String args[]){
	BadClass badObject = new BadClass() ;
	try{
		badObject.doSomeThingBad();
	}catch(ClassNotFoundException e){
		System.out.println("BadClass Threw :"+e);
	}
}
}


class BadClass {
	void doSomeThingBad() throws ClassNotFoundException {
		throw new ClassNotFoundException("What you are looking for is not here");
	}
}

