package collection;

import java.util.ArrayList;
import java.util.Map;

public class Showroom {

	String shrName;
	Map<String, Car> cars;

	public String getshrName() {
		return shrName;
	}

	public void setshrName(String shrName) {
		this.shrName = shrName;
	}

	public Map<String, Car> getcars() {
		return cars;
	}

	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}

}
