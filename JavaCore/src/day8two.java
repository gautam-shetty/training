//wrapper class and boxing
public class day8two {

	public static void main(String[] args) {
		String x="15";
		Integer a=Integer.parseInt(x);
		int y=a;
		System.out.println(y);

		int aa=10;
		Integer i1=aa;
		Integer i2=new Integer(aa);
		System.out.println(i1+" "+i2);

		/*double y=10.5;
		float  x=(float)y;

		float a=10.5f;
		float c=(float)10.5;
		*/
		
		char i='A';
		int in1=i;
		System.out.println(in1);
		
		int var=65;
		char var1=(char)var;
		System.out.println(var1);
	}

}
