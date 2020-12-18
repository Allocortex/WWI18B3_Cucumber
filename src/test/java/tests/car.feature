Feature: Create a car

  Scenario: Should be able to create a car
    Given There is no car
    When I create a car with the model "Stinger"
    Then The model must be "Stinger"
    
  Scenario: Should be able to rename a car
  	Given There is no car
  	When I create a car with the model "Twingo"
  	And I set its model to "Mustang"
  	Then The model must be "Mustang"
  	
  Scenario: should be able to set the horsepower of a car
  	Given There is no car
  	When I create a car with the model "M4"
  	And I set its horsepower to 300
  	Then The horsepower must be 300
  	
	Scenario: should be able to change the model and set the horsepower of a car
		Given There is no car
		When I create a car with the model "Punto"
		And I set its model to "CL500"
		And I set its horsepower to 435
		Then The model must be "CL500"
		And The horsepower must be 435