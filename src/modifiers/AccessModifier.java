package modifiers;

public class AccessModifier {

	// add public if the method needs to be accessed from other packages also if this is the only class
	// no need to be added
	// static int add(int a, int b)  it is a static method directly we can access the method without creating the object
	int add(int a, int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		// If the method is static method then no need to use this we can directly access the method
		//like
		// int sum = add(10,9);
		// else we need to create object of the class and then access the method through the class
		AccessModifier obj = new AccessModifier(); 
		int sum = obj.add(10,9);
		System.out.println(sum);
	}

}
