interface PhoneNumber {
	boolean numberFormat(String number);
}

abstract class Country implements PhoneNumber {
	Boolean hasNumb(String data) {
		boolean res=false;
		char[] arr = data.toCharArray();
		for (char op : arr) {
			if( op > 47 && op < 58 ) res=true;
			else { res=false; break; }
		}
		return res;
	}
}

class India extends Country {
	public boolean numberFormat(String number) {
		boolean res=false;
		if(number.length()==14
				&& number.substring(0,4).equals("+91-")
				&& (hasNumb(number.substring(4)))
		   ==true) res=true;
		else res=false;
		return res;
	}
}

class Brazil extends Country {
	public boolean numberFormat(String number) {
		boolean res=false;
		if(number.length()==17 
				&& number.substring(0,4).equals("+55 15 ") 
				&& (hasNumb(number.substring(4)))
		   ==true) res=true;
		else res=false;
		return res;
	}
}
class Norway extends Country {
	public boolean numberFormat(String number) {
		boolean res=false;
		if(number.length()==14
				&& number.substring(0,4).equals("+91-")
				&& (hasNumb(number.substring(4)))
		   ==true) res=true;
		else res=false;
		return res;
	}
}
class Qatar extends Country {
	public boolean numberFormat(String number) {
		boolean res=false;
		if(number.length()==14
				&& number.substring(0,4).equals("+91-")
				&& (hasNumb(number.substring(4)))
		   ==true) res=true;
		else res=false;
		return res;
	}
}
class Turkey extends Country {
	public boolean numberFormat(String number) {
		boolean res=false;
		if(number.length()==14
				&& number.substring(0,4).equals("+91-")
				&& (hasNumb(number.substring(4)))
		   ==true) res=true;
		else res=false;
		return res;
	}
}

public class day10task {

	public static void main(String[] args) {
		
		India in=new India();
		Brazil br=new Brazil();
		Norway no=new Norway();
		Qatar qa=new Qatar();
		Turkey tk=new Turkey();
		
		boolean ans=in.numberFormat("+91-9789751474");
		System.out.println(ans);
	}

}
