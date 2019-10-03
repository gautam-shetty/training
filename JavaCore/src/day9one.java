//multi-dime arrays in java
public class day9one {
	
	public static void main(String[] args) {
		//day9one d=new day9one();
		String[][] data=new String[3][];
		
		data[0]=new String[50];
		data[1]=new String[30];
		data[2]=new String[70];    //custom string limits are allowed in java
		int ctr=0;
		for(String[] arr:data) {
			for(String ele:arr) {
//				System.out.println(ele);  //to print individual values
				ctr++;
			}
		}
		System.out.println(ctr);
	}

}
