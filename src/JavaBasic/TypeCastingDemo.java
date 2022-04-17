package JavaBasic;

public class TypeCastingDemo {
	
      public static void main(String[] args) {
	
	//convert int to float-implicite type casting.
	   int a=15;
	   float b=a;
	System.out.println(a);
	System.out.println(b);
	
	// Convert float to int- explicite type casting.
	   float c=13.45f;
	   int d=(int)c;
	System.out.println(c);
	System.out.println(d);
	
	
	
}
}

/*
Widening Casting (automatically) - converting a smaller type to a larger type size--implicit type casting
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type----explicit type casting
double -> float -> long -> int -> char -> short -> byte 
*/






