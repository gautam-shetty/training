//strings
public class day9two {
	
	public static void main(String[] args) {
	/*	String a="abcd";
		a=a.concat(" efg");
		System.out.println(a);  */
		
		String b="Hello";
		String c="Hello";	//String 
		if(b==c) System.out.println("TRUE"); //OP - True
		
		String x=new String("Hello");
		String y=new String("Hello");  //String Class is created
		if(x==y) System.out.println("TRUE");
		else System.out.println("FALSE");  //OP - False
		
		if(x.equals(y)) System.out.println("TRUE");   //OP - True as only values are checked
		
		StringBuilder sb=new StringBuilder("HELLO");
		sb.append(" WORLD");
		System.out.println(sb.reverse());
	}

}
