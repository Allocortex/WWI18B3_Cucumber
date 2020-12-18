package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import java.util.Objects;

import implementations.*;

public class StepDefinitions {

	private Car car;
	private Driver driver;

	// Car stuff

	@Given("There is no car")
	public void there_is_no_car() {
		assertTrue(car == null);
	}

	@When("I create a car with the model {string}")
	public void i_create_a_car_with_the_model(String model) {
		car = new Car(model);
	}

	@When("I set its model to {string}")
	public void i_set_its_model_to(String model) {
		car.setModel(model); 
	}

	@When("I set its horsepower to {int}")
	public void i_set_its_horsepower_to(int horsepower) {
		car.setHorsepower(horsepower);
	}

	@Then("The horsepower must be {int}")
	public void the_horsepower_must_be(int horsepower) {
		assertTrue(car.getHorsepower() == horsepower);
	}

	@Then("The model must be {string}")
	public void the_model_must_be(String model) {
		assertTrue(car.getModel().equals(model));
	}

	// Driver stuff

	@Given("There is a driver")
	public void there_is_a_driver() {
		driver = new Driver();
	}

	@Given("The driver has no car")
	public void the_driver_has_no_car() {
		assertTrue(driver.getCar() == null);
	}

	@Given("The driver has no license")
	public void the_driver_has_no_license() {
		assertTrue(!driver.hasLicense());
	}

	@When("The driver gets a license")
	public void the_driver_gets_a_license() {
		driver.getsLicense();
	}

	@When("The driver buys a car with the model {string}")
	public void the_driver_buys_a_car_with_the_model(String string) {
		driver.buysCar(new Car(string));
	}

	@When("The police takes away the license for speeding")
	public void the_police_takes_away_the_license_for_speeding() {
		driver.policeTakesLicense();
	}

	@Then("The driver must have a car with the model {string}")
	public void the_driver_must_have_a_car_with_the_model(String string) {
		assertTrue(driver.getCar().getModel().equals(string));
	}

	@Then("The driver must be able to drive")
	public void the_driver_must_be_able_to_drive() {
		assertTrue(driver.canDrive());
	}

	@Then("The driver must not be able to drive")
	public void the_driver_must_not_be_able_to_drive() {
		assertFalse(driver.canDrive());
		;
	}

	@Then("The driver must have a license")
	public void the_driver_must_have_a_license() {
		assertTrue(driver.hasLicense());
	}
}
