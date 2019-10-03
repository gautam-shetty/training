//Interfaces
interface if1 {
	void abc();
}

interface if2 {
	void test();
}

interface ifChild1 extends if1,if2 {	//contains abc(),testing() and test() methods , MULTIPLE INHERITANCE
	void testing();
}

class myclass implements ifChild1 {
	public void abc() {		//only public can be used with interface
		
	}
	public void test() {	//because child interface inherit parent method too, so both have to be called
		
	}
	public void testing() {
		
	}
}

public class day10two {

	public static void main(String[] args) {
		
	}

}
