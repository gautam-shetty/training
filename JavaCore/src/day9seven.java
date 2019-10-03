//constructor
public class day9seven {
	
	int x;
	/* MyFirstJavaProg(){
	x=10;
	}
	*/ day9seven(int x){
	this.x=x;
	}
	void disp(){
	System.out.println(x);
	}

	public static void main(String[] args) {

		day9seven m = new day9seven(50);
		/*
		 * day9seven m1= new day9seven();
		 */
		m.disp();
		// m1.disp();

		// new day9seven().disp();

	}

}
