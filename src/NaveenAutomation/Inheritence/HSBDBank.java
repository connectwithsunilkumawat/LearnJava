package NaveenAutomation.Inheritence;

public class HSBDBank implements USBank , BrazilBank // Multiple Inheritance (only allow in case of interfaces) , it is called is-a relationship
{

	@Override
	public void credit() {
		System.out.println("Interface USBank - Credit");		
	}

	@Override
	public void debit() {
		System.out.println("Interface USBank - Debit");	
		
	}

	@Override
	public void transferMoney() {
		System.out.println("Interface USBank - TransferMoney");	
		
	}
	
	public void homeLoan() {
		System.out.println("HSBDBank - Home Loan");	
		
	}
	
	public void carLaonn() {
		System.out.println("HSBDBank - Car Laonn");	
		
	}

	@Override
	public void mutualFund() {
		System.out.println("Interface BrazilBank - mutualFund");	

		
	}

	

}
