class Account{
	int accountNumber;
	float balance;
	
	Account(int acc,int bal){
		accountNumber = acc;
		balance = bal;
	}
	
	synchronized void withdraw(int amount){
		balance -= amount;
		System.out.println("Withdrawn ,New Balance :"+balance);
	}

	synchronized void deposit(int amount){
		balance += amount;
		System.out.println("Deposited ,New Balance :"+balance);
	}
	
	void showBalance(){
		System.out.println("Balance :"+balance);	
	}
}


class DepositThread extends Thread{
	int amount;
	Account accountOb;
	
	DepositThread(int amt,Account acc){
	amount = amt;
	accountOb = acc;
	}
	
	public void  run(){
		accountOb.deposit(amount);
	}
}


class WithdrawThread extends Thread{
	int amount;
	Account accountOb;
	
	WithdrawThread(int amt,Account acc){
	amount = amt;
	accountOb = acc;
	}
	
	public void run(){
		accountOb.withdraw(amount);
	}
}

class MultithreadingFour {
	public static void main(String args[]){
		Account account = new Account(1002,20000);
		account.showBalance();
		DepositThread deposit = new DepositThread(100,account);
		deposit.start();
		WithdrawThread withdraw = new WithdrawThread(1000,account);
		withdraw.start();
		
	}
}

