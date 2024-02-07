import java.util.*;


class RandomGen implements Runnable{
	Thread t;
	Random rand = new Random();
	RandomGen(){
		t = new Thread(this,"random");
		t.start();
	}
	
	public void run(){
		while(true){
		try{
	 			int num = rand.nextInt(10);
				if(num%2 == 0){
					Squarer sq = new Squarer(num);
				}else{
					Cuber cube = new Cuber(num);
				}
				t.sleep(1000);
		}catch(InterruptedException e) {
				System.out.println("RandomGen Interrupted");
			
			}
		}
		
	}
}

class Squarer implements Runnable{
	Thread t;
	int num;
	Squarer(int n){
		num = n;
		t = new Thread(this,"Squarer");
		t.start();
	}
	
	public void run(){
		System.out.println("Square of "+num +" is :"+(num*num));
	}
		
}


class Cuber implements Runnable{
	Thread t;
	int num;
	Cuber(int n){
		num = n;
		t = new Thread(this,"Cuber");
		t.start();
	}
	
	public void run(){
		System.out.println("Cube of "+num +" is :"+(num*num*num));
	}
		
}

class MultithreadingTwo{
	public static void main(String args[]){
		RandomGen rn = new RandomGen();
	}
}
