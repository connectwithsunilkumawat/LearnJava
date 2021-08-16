package NaveenAutomation.Inheritence;

public class TestBank {

	public static void main(String[] args) {
		HSBDBank obj = new HSBDBank();
		obj.credit();
		obj.debit();
		obj.transferMoney();
		obj.homeLoan();
		obj.carLaonn();
		System.out.println(HSBDBank.min_bal);
		System.out.println(USBank.min_bal);
		System.out.println(obj.min_bal);
		
		System.out.println("---------------------");
		
		// Dynamic Polymorphism - Parent class (Interface) reference variable can point to Child class object
		
		USBank i = new HSBDBank();
		
		i.credit();
		i.debit();
		i.transferMoney();
		

	}

}
