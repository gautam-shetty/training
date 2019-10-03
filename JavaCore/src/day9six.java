//method overloading
public class day9six {
	
	void add(int x,int y) {
		System.out.println("ABC1");
	}
	int add(int x,int y,String z) {
		System.out.println("ABC2");
		return 0;
	}
	String add(int x,String y) {
		System.out.println("ABC3");
		return "strDATA";  //return value/type dosnt matter
	}
	int arr(int... num) {  //variable length argument
		System.out.println(num.length);
		return 0;
	}
	void add(int x,int y,int z) {
	}

	public static void main(String[] args) {
		day9six m=new day9six();
		m.add(10,20);
		m.add(1,2,"test");	
		m.add(01201,"asdas");
		m.arr(1,2,3,4,5,6,7);
	}

}
