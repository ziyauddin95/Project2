package CoditionDemo;

public class switchDemo {
	public static void main(String args []) {
		int Day=6;
		switch (Day) {
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3: System.out.println("wednsday");
		break;
		case 4: System.out.println("Tuesday");
		break;
		case 5: System.out.println("thersday");
		break;
		case 6: System.out.println("Friday");
		break;
		default:System.out.println("not acceptable");	
		}
	
	
	int a=40;
	int b=50;
	String operation="Div";
	switch(operation) {
	case "Add":System.out.println(a+b);
    break;
	case "Sub":System.out.println(a-b);
	break;
	case "Mul":System.out.println(a*b);
	break;
	case "Div":System.out.println(b/a);
	break;
	default:System.out.println("not acceptable");
	}
	
  }
}
