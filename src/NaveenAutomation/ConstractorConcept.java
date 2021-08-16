package NaveenAutomation;

public class ConstractorConcept {

	public ConstractorConcept() {
		System.out.println("I am Default Constractor");
	}

	public ConstractorConcept(int i) {
		System.out.println("One Parameter Constractor: " + i);
	}

	public ConstractorConcept(int i, int j) {
		System.out.println("Two Parameter Constractor: " + i + "and" + j);
	}

	// Can we overload the constractor - Yes we , as above

	public static void main(String[] args) {
		ConstractorConcept obj = new ConstractorConcept(); // Default Constractor , if we not create it , it created
															// automatically
		ConstractorConcept obj1 = new ConstractorConcept(5);
		ConstractorConcept obj2 = new ConstractorConcept(5, 10);

	}
	
	//Formating - Cont + Shift + F

}
