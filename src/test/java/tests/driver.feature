Feature: Do driver stuff

  Scenario: Should be able to buy a car
    Given There is a driver
    And The driver has no car
    When The driver buys a car with the model "Stinger"
    Then The driver must have a car with the model "Stinger"
    
  Scenario: Should be able to get a license
  	Given There is a driver
  	And The driver has no license
  	When The driver gets a license
  	Then The driver must have a license
  	
  Scenario: Should be able to drive when he has a car and a license
  	Given There is a driver
  	When The driver gets a license
  	And The driver buys a car with the model "Focus"
  	Then The driver must be able to drive
 
   Scenario: Should not be able to drive when he has a car but no license
  	Given There is a driver
  	When The driver gets a license
  	And The driver buys a car with the model "Elise"
  	But The police takes away the license for speeding
  	Then The driver must not be able to drive