//objs , this
public class day8five {
	
	//static int x;
	int x=50;
	void init() {
		int x;
		x=10;
		System.out.println("TEST "+this.x);
	}
	public void disp() {
		System.out.println(x);
	}
	void abc(){
		System.out.println(x);
	}

	public static void main(String[] args) {
		day8five m=new day8five();
		//day8five m1=new day8five();
		m.init();
		m.disp();
	}

}
