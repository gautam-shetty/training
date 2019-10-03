//multi-dim array
public class day10five {

	public static void main(String[] args) {

		//day10five d = new day10five();

		String[][] data = new String[3][];

		String[][] data1 = { { "hello", "abc" }, { "a", "b", "c", "d" }, { "aa", "bb", "cc" }, { "ww", "ee", "rr" } };

		data[0] = new String[50];
		data[1] = new String[40];
		data[2] = new String[70];
		int ctr = 0;
		for (String[] arr : data1) {
			for (String ele : arr) {
				System.out.print(ele + " ");
				ctr++;
			}
			System.out.println();
			System.out.println("---");
		}

		System.out.println(ctr);

	}

}
