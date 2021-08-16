package NaveenAutomation.Inheritence;

public interface USBank
{
	int min_bal = 100;
	public void credit();
	public void debit();
	public void transferMoney();
	
      //only method declarations
      // no method body - only method prototype
      // In Interface , we can declare the variable , that variables by default static in nature
      //Variable values will not be changed
      // No static methods in Interfaces
      //can't create object of interface
      //interfaces are abstract in nature
}
