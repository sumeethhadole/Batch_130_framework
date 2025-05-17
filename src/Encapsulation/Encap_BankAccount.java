package Encapsulation;

public class Encap_BankAccount {

	public static void main(String[] args) {

		BankAccount Acc = new BankAccount(10000);
		System.out.println("Initial Amount "+Acc.getBal());
		Acc.withdraw(1000);
		System.out.println(Acc.getBal());
		Acc.deposit(5000);
		System.out.println(Acc.getBal());
		Acc.withdraw(7000);
		System.out.println(Acc.getBal());
		Acc.withdraw(7000);
		System.out.println(Acc.getBal());
	}
}
class BankAccount{
	private double bal;
	
	public BankAccount(double bal) {
		this.bal=bal;
	}
	public double getBal() {
		return bal;
	}
	public void deposit(double amount) {
		if(amount >0 ) {
			bal+=amount;
			System.out.println("Amount deposit"+amount);
		}else {
			System.out.println("Amount deposit must have positive");
		}
		
	}
	public void withdraw(double amount) {
		if(amount>0 && amount <=bal) {
			bal-=amount;
		}else {
			System.out.println("Invalid amount");
		}
	}
}
