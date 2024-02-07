class Newthread1 implements Runnable {
	Thread t;
	Newthread1(){
		t = new Thread(this,"odder");
		t.start();
	}
	
	public void run(){
		for(int i=1;i<=10;i++){
			if(i%2 != 0){
				System.out.println("Odd :"+i);
				try{
					t.sleep(1000);
				}catch(InterruptedException e){
					System.out.println("Odder Stopped");
				}
			}
		}
	}
	
	
}



class Newthread2 implements Runnable {
	Thread t;
	Newthread2(){
		t = new Thread(this,"evener");
		t.start();
	}
	
	public void run(){
		for(int i=1;i<=10;i++){
			if(i%2 == 0){
				System.out.println("Even :"+i);
				try{
					t.sleep(1000);
				}catch(InterruptedException e){
					System.out.println("Evener Stopped");
				}
			}
		}
	}
	
	
}


class MultithreadingOne {
	public static void main(String args[]){
	Newthread1 ob1 = new Newthread1();
	Newthread2 ob2 = new Newthread2();
	}
	
}
