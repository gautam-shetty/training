// loops with label, continue
public class day9eight {

	public static void main(String[] args) {

		int[] x1 = { 1, 25, 4, 7, 8 };

		for (int a : x1) {		//for each loop
			System.out.println(a);
		}
		
		System.out.println("\n\n");

		thinkOuter: for (int x = 0; x < 5; x++) {

			for (int i = 0; i < 5; i++) {
				if (x == 3 && i == 3)
					break thinkOuter;

				System.out.println(x + " " + i);
			}

		}

		System.out.println("\n\n");

		for (int x = 0; x < 5; x++) {

			System.out.println(x);

			if (x == 2)
				continue;

			System.out.println("HELLO");

		}

	}

}
