package implementations;

public class Driver {

	private Car car;
	private boolean hasLicense = false;

	public Car getCar() {
		return car;
	}

	public void buysCar(Car car) {
		this.car = car;
	}

	public boolean hasLicense() {
		return hasLicense;
	}

	public void getsLicense() {
		this.hasLicense = true;
	}

	public void policeTakesLicense() {
		this.hasLicense = false;
	}

	public boolean canDrive() {
		return (!(this.car == null) && this.hasLicense);
	}
}
