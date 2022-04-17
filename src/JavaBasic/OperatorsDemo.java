package JavaBasic;

public class OperatorsDemo {
	
	public static void main(String[] args) {
		int a=123;
		int b=34;
		int SUM=a+b;
		int SUB=a-b;
		int MUL=a*b;
		int DIV=a/b;
		                             // Operations Addition, Subtraction, multiplications, devision.
		System.out.println(SUM);                // Arithmetic Operators
		System.out.println(SUB);             
		System.out.println(MUL);             
		System.out.println(DIV);
		
	    System.out.println(a/b);               // Modulus Operators.
     		
		int c=6;                              // increment 
		System.out.println(++c);
		System.out.println(c++);
		
		int d=56;                             //Decrement 
		System.out.println(--d);
		System.out.println(d--);
		
		System.out.println(a==b);             // Comparison Operators
		System.out.println(a!=b);	
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		
		int e=34;                          //Logical Operator ( And / Or )
		int f=34;
		
		System.out.println(e<40&&f==34);
		System.out.println(e>20||f<45);
		
		
		
			
	}
}
