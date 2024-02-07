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
					EvenPrint sq = new EvenPrint(num);
				}else{
					OddPrint od = new OddPrint(num);
				}
				t.sleep(1000);
		}catch(InterruptedException e) {
				System.out.println("RandomGen Interrupted");
			
			}
		}
		
	}
}

class EvenPrint implements Runnable{
	Thread t;
	int num;
	EvenPrint(int n){
		num = n;
		t = new Thread(this,"Evener");
		t.start();
	}
	
	public void run(){
		for(int i = 1;i<=num;i++){
			if(i%2 == 0){
				System.out.println(num + " : "+i);
			}
		}
	}
		
}


class OddPrint implements Runnable{
	Thread t;
	int num;
	OddPrint(int n){
		num = n;
		t = new Thread(this,"Odder");
		t.start();
	}
	
	public void run(){
		for(int i = 1;i<=num;i++){
			if(i%2 != 0){
				System.out.println(num + " : "+i);
			}
		}
	}
}

class MultithreadingThree{
	public static void main(String args[]){
		RandomGen rn = new RandomGen();
	}
}
