import javax.swing.JFrame;
import javax.swing.JOptionPane;

//return value

public class day8four {
	
	int a(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		day8four m = new day8four();
		int result = m.a(5, 6);
		JOptionPane.showMessageDialog(new JFrame(), result);
		System.out.println(result);
	}
}
