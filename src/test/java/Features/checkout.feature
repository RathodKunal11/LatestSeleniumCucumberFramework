Feature: Search, add it the cart and palce the order

Scenario Outline: Verify that the user can add product to the cart and place the order successfully
		Given user is on green cart landing page
    When user search product with shortname <Name>
    And add product <NoOfItems> to the cart
    Then user proceeds to the checkout and validate the product name <Name> at the checkout page
    And verify user has ability to enter promo code and place the order
    
Examples: 
|Name	|NoOfItems|
|Tom	|3				|