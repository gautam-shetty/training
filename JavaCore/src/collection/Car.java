package collection;

public class Car {

	String modelNo;
	String carName;

	public String getmodelNo() {
		return modelNo;
	}

	public void setmodelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getcarName() {
		return carName;
	}

	public void setcarName(String carName) {
		this.carName = carName;
	}


	public Car(String modelNo, String carName) {
	this.modelNo = modelNo;
	this.carName = carName;
	}

	@Override
	public String toString() {
		return getmodelNo() + " " + getcarName();
	}

}
