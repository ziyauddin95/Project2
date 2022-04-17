package Inheritance;

public class Test3 extends Test2{

	public void Mult(){
		System.out.println(a*c);
		
	}
	public static void main(String [] args) {
		Test1 obj1=new Test1();
		obj1.Sum();
		
		Test2 obj2=new Test2();
		obj2.Sub();
		
		Test3 obj3=new Test3();
		obj3.Mult();
		
	}

}
