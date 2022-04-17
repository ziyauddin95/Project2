package Polymorphism;

public class PolyTest2 extends PolyTest1{

	public void Method1() {
		System.out.println("I am  Method1 from Child class");
	}
	
	public void Method2(int a){
		System.out.println("I am  Method2 from Child class");
	}
	
	public void Method3(){
		System.out.println("I am  Method3 from Child class");
	}
	
	public static void main(String [] args) {
		
		  PolyTest1 obj1=new PolyTest1();                    //Possibility-1
		  obj1.Method1();        //from PoliTest1 class
		  obj1.Method2();        // from PolyTest1 class
		  obj1.Method4();        // from PolyTest1 class
		  
		  
		  PolyTest2 obj2=new PolyTest2();                   //Possibility-2
		  obj2.Method1();       //from PoliTest2 class
		  obj2.Method2();       //from PoliTest1 class
		  obj2.Method2(0);   	//from PoliTest2 class  
		  obj2.Method3();       //from PoliTest2 class
		  obj2.Method4();       //from PoliTest1 class
		  
		  
		 // PolyTest2 obj3=new PolyTest1();                   //Possibility-3----Not possible
		  
		 
		  PolyTest1 obj4=new PolyTest2();  
		  obj4.Method1();          //from PoliTest1 class
		  obj4.Method2();         //from PoliTest1 class
		  obj4.Method4();        //from PoliTest1 class
		  
	}
}
