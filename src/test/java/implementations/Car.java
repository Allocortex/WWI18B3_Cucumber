package implementations;

public class Car {

	private String model;
	private int horsepower;

	public Car(String model) {
		this.model = model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return this.model;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getHorsepower() {
		return this.horsepower;
	}
}
