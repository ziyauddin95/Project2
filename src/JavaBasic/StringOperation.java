package JavaBasic;

public class StringOperation {                          // String methods & Operations

	   public static void main(String[] args) {
		   
		   String a="I am Ziyauddin";
		   
		   System.out.println(a.length());         // Total length of the name including space also.
		   System.out.println(a.toUpperCase());    // Capital letters.
		   System.out.println(a.toLowerCase());    // Small letters.
		   System.out.println(a.indexOf("am"));    //am is reaching on 2nd.
		   System.out.println(a.charAt(5));        // on 5 number, z is reaching.
		   
		   
		   String b= "Ziyauddin";
		   String c= "Kazi";
		    System.out.println( b+" "+c);              //Adding Space between two word
		    System.out.println("        " +c);        // String concatenation.
		    
		    
		    
		    String Name= "     Ziyauddin";
		    System.out.println(Name.substring(3));      // Substring- first 3 char removed from name.
		    System.out.println(Name.substring(2,6));  
		    
		    System.out.println(Name.equals("Ziya"));    //equal
		    
		    
		    System.out.println(Name.replace('d','z'));   //Replace
		    
		    
		    System.out.println(Name.trim());            // trim- ignorance of void space from front side of the word
		    
		    
		    //Revese operation using for loop//
		    
			String x="Rahul";		
			int y= x.length();
			
			for (int z=y-1;z>=0;z--) {
				System.out.print(x.charAt(z));
			}
}
}