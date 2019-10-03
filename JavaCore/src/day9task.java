
public class day9task {
	
	static String hasUpper(String data) {
		char[] arr = data.toCharArray();
		for (char op : arr) {
			if( op > 64 && op < 91 ) {
				return "yes";
			}
		}
		return "no";
	}
	
	static String hasNumb(String data) {
		char[] arr = data.toCharArray();
		for (char op : arr) {
			if( op > 47 && op < 58 ) {
				return "yes";
			}
		}
		return "no";
	}
	
	static String hasSymb(String data) {
		char[] arr = data.toCharArray();
		for (char op : arr) {
			if(!(( op > 47 && op < 58 )&&( op > 64 && op < 91 )&&( op > 96 && op < 123 ))) {
				return "yes";
			}
		}
		return "no";
	}
	
	static Boolean isCapsOnly(String data) {
		boolean res=false;
		char[] arr = data.toCharArray();
		for (char op : arr) {
			if( op > 64 && op < 91 ) {
				res=true;
			}
			else res=false;
		}
		return res;
	}
	
	static int countCaps(String data) {
		int ct=0;
		char[] arr = data.toCharArray();
		for (char op : arr) {
			if( op > 64 && op < 91 ) {
				ct++;
			}
		}
		return ct;
	}
	
	static String myReplace(String data, char oldChar , char newChar) {
		char[] arr = data.toCharArray();
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==oldChar)
				arr[i]=newChar;
		}
		return new String(arr);
	}
	
	static String myFReplace(String data, char oldChar , char newChar) {
		char[] arr = data.toCharArray();
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==oldChar) {
				arr[i]=newChar; break;
			}
		}
		return new String(arr);
	}

	static String myLReplace(String data, char oldChar , char newChar) {
		char[] arr = data.toCharArray();
		for (int i=arr.length-1;i>0;i--) {
			if(arr[i]==oldChar) {
				arr[i]=newChar; break;
			}
		}
		return new String(arr);
	}
	
	static boolean isEqual(char c1 , char c2) {
		if(c1>90) c1-=32;
		else if(c2>90) c2-=32; 
		if(c1==c2)	return true;
		return false;
	}
	
	static boolean isEqualStr(String str1 , String str2) {
		//boolean res=false;
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if(arr1.length!=arr2.length) return false;
		for (int i = 0; i < arr1.length; i++) 
            if (arr1[i] != arr2[i]) 
                return false; 
		return true;
	}
	
	static String rev(String data) {
		char[] arr = data.toCharArray(), temp=arr;
		String rarr="";
		for (int i=arr.length-1,j=0;i>=0;i--,j++) {
			if(temp[j]<91&&arr[i]>90) rarr+=(char)(arr[i]-32);
			else if(temp[j]>91&&arr[i]<90) rarr+=(char)(arr[i]+32);
			else rarr+=(char)arr[i];
		}
		return new String(rarr);
	}
	
	public static void main(String[] args) {
		String a,b,c,f,g,h,k,temp="GAUTAM SHETTY";
		Boolean d,i,j; int e;
		a=hasUpper(temp);
		b=hasNumb(temp);
		c=hasSymb(temp);
		d=isCapsOnly(temp);
		e=countCaps(temp);
		f=myReplace(temp,'A','X');
		g=myFReplace(temp,'A','X');
		h=myLReplace(temp,'A','X');
		i=isEqual('a','A');
		j=isEqualStr("ABCD","ABCD");
		k=rev("heLloWORLD");
		System.out.println("STRING USED - "+temp+"\n");
		System.out.println("Capital letter present - "+a);
		System.out.println("Number present - "+b);
		System.out.println("Symbol present - "+c);
		System.out.println("All caps check - "+d);
		System.out.println("Number of Cap letter - "+e);
		System.out.println("All replace - "+f);
		System.out.println("First replace - "+g);
		System.out.println("Last replace - "+h);
		System.out.println("Char value equal check - "+i);
		System.out.println("String check - "+j);
		System.out.println("Rev string with cap pos in place - "+k);
	}

}
