//access level
// except private and constructor
class Calc {
	private void abc() {
		System.out.println("PARENT METHOD");
	}

	void xyz() {
		System.out.println("PARENT METHOD");
	}
}

class SciCalc extends Calc {
	@Override
	void xyz() {
		System.out.println("MODIFIED METHOD");

	}

	private void abc() {
		System.out.println("CHILD METHOD");
	}
}

public class day10six {

	public static void main(String[] args) {

		SciCalc sciCalc = new SciCalc();
		// sciCalc.abc();
		sciCalc.xyz();

	}

}
