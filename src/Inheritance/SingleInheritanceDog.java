package Inheritance;

public class SingleInheritanceDog extends SingleInheritanceAnimal {

	public void eat() {
		System.out.println("Eating something");
	}
	
	public static void main(String [] args) {
		
		SingleInheritanceDog Obj1=new SingleInheritanceDog();
		         Obj1.drink();
	}
}
