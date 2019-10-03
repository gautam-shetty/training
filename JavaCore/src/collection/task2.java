package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class task2 {

	public static void main(String[] args) {
		Car Car = new Car("A2210", "A.1");
		Car Car1 = new Car("2210R", "A.2");
		Car Car2 = new Car("22GT", "A.3");
		Car Car3 = new Car("ASUD", "A.4");

		Showroom Showroom = new Showroom();
		Showroom.setshrName("Comp A");

		HashMap<String, Car> Cars = new HashMap<>();

		Cars.put(Car.getmodelNo(), Car);
		Cars.put(Car1.getmodelNo(), Car1);
		Cars.put(Car2.getmodelNo(), Car2);
		Cars.put(Car3.getmodelNo(), Car3);

		Showroom.setCars(Cars);

		HashMap<String, Car> libCars = (HashMap<String, Car>) Showroom.getcars();
		// System.out.println(libCars.get("#123"));

		// ---------------------------------------

		Car Car4 = new Car("BUS1", "B.1");
		Car Car5 = new Car("BUS2", "B.2");
		Car Car6 = new Car("BUS3", "B.3");
		Car Car7 = new Car("IOIAOBB4", "B.4");

		Showroom Showroom2 = new Showroom();
		Showroom2.setshrName("Comp B");

		HashMap<String, Car> Cars1 = new HashMap<>();

		Cars1.put(Car4.getmodelNo(), Car4);
		Cars1.put(Car5.getmodelNo(), Car5);
		Cars1.put(Car7.getmodelNo(), Car7);
		Cars1.put(Car6.getmodelNo(), Car6);

		Showroom2.setCars(Cars1);

		HashMap<String, Map<String, Car>> shwrmCollections = new HashMap<>();

		shwrmCollections.put(Showroom.getshrName(), Showroom.getcars());
		shwrmCollections.put(Showroom2.getshrName(), Showroom2.getcars());

		String temp="Comp A";
		Map<String, Car> stateShowroomCars = shwrmCollections.get(temp);
		
		Collection<collection.Car> modelNos = stateShowroomCars.values();
		
		System.out.println("Cars IN " + temp);
		System.out.println( modelNos);
		//System.out.println(Arrays.toString(modelNos.toArray()));

//		for (String modelNo : modelNos) {
//			System.out.println(stateShowroomCars.get(modelNo));
//		}

	}

}
