# Author: reynaldi.octavially@gmail.com

Feature: Product Selection

@productSelection
Scenario Outline: Successfully display and add products to shopping bag in specific category
  Given Customer chooses the "<category>" category
  When Customer selects "<productCategory>" from product categories
  And Customer applies filters product categories "<product1>", "<product2>", and "<product3>"
  And Customer clicks the all filters button
  And Customer applies a price filter for products below "<price>"
  And Customers see a list of products based on filters
  And Customer selects an available product
  And Customer is on the product detail page
  #And Customer chooses an available product size
  And Customer clicks the add to bag button
  Then Customer should see the product successfully added to the shopping bag

  Examples:
    | category | productCategory    | price    | product1    | product2 | product3 |
    | Men      | New Arrival        | 10000000 | Accessories | Shoes    | Clothes  |
 
 
