//task better solution
public class day10four {
	

	static Boolean hasNumb(String data) {
		boolean res=false;
		char[] arr = data.toCharArray();
		for (char op : arr) {
			if( op > 47 && op < 58 ) {
				res=true;
			}
			else { res=false; break; }
		}
		return res;
	}

	public static void main(String[] args) {
		  String s="+91-9789751474";
		  
		 // System.out.println(s.substring(0,4));
		if(s.substring(0,4).equals("+91-")&&(hasNumb(s.substring(4)))==true) System.out.println("true");
		else System.out.println("false");
	}

}
