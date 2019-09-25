//instance and class vars
public class day8one {
	
	int x;
	static Integer y;

	public static void main(String[] args) {
		
		day8one m=new day8one();
		day8one m1=new day8one();
		m.x=50;
		m1.x=10;
		System.out.println(m.x);
		System.out.println(m1.x);
		m.y=20;
		m1.y=40;
		System.out.println(m.y);
		System.out.println(m1.y);
		

//		m=null;
//		System.out.println(m.x);     --null pointer error
	}

}
