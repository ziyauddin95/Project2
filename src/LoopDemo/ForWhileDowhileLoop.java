package LoopDemo;

import java.util.*;
public class ForWhileDowhileLoop {
public static void main (String []args) {

	//print 0 to 10 numbers using for loop- for loop.
	
	for(int i=0; i<=10; i++) {
		System.out.println(i);
	}	
	
	//print 0 to 10 numbers using while loop
	int a=0;
	while(a<=10) {
		System.out.println(a);
		a++;
	}
	
	//print Ziyauddin using do-while loop
	
	int b=6;
	
	do {
		System.out.println("Ziyauddin");
	}
	while (b<=5);
	
	
	//Nested loop- in which two for condition is use this print # in solid rectangular.
	Scanner sc =new Scanner(System.in);
	int v=sc. nextInt();
	int y=sc. nextInt();
	for (int p=1; p<=v;p++) {
		for (int q=1; q<=y; q++) {
			System.out.print("#");
		}
		System.out.println( );
	}
	
}
}
