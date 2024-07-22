Feature: search and place the order for the product

  Scenario Outline: validate the search experience in both home page and offer page
    Given user is on green cart landing page
    When when user search product with shortname <Name> and extracted the actual name of product
    Then user search same product with shortname <Name> in the offer page to check if product exist
    
  Examples:
  |Name	|
  |Tom	|
  |Beet	|
