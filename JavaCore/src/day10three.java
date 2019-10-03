//marker interface

interface pass { }

class Data{
	void storeData(Object obj){
		if(obj instanceof pass){
			System.out.println("YOUR DATA IS PRESERVED");
		} else{
			System.out.println("Cannot Preserve YOUR DATA Contact your DATA Provider");
		}
	}
}

class EmployeeDataProvider implements pass {  // because it allows instance of pass
}

public class day10three {

	public static void main(String[] args) {
		
		EmployeeDataProvider edp=new EmployeeDataProvider();
		Data data=new Data();
		
		data.storeData(edp);
		
	}

}
