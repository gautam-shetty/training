//abstract classes
abstract class MyHomePlan {
	void garden() {}
	void pool() {}
	abstract void location();
}

class MyHome extends MyHomePlan {
	@Override
	void location() {
		System.out.println("LOC COmpleted");
	}
}

public class day10one {

	public static void main(String[] args) {
		MyHome myHome=new MyHome();
		myHome.garden();
		myHome.pool();
		myHome.location();
	}

}
