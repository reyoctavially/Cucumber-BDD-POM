# Author: reynaldi.octavially@gmail.com

Feature: Mens Product

@mensNewArrival
Scenario Outline: Successfully display and add products to shopping cart in mens new arrivals category with price under "<price>" and not in "<product1>" or "<product2>" categories
  Given Customer is on the home page
  When Customer chooses the "<category>" category
  And Customer selects "<productCategory>" from product categories
  And Customer applies filters to exclude product categories "<product1>" and "<product2>"
  And Customer clicks the all filters button
  And Customer applies a price filter for products below "<price>"
  And Customer selects an available product
  And Customer is on the product detail page
  And Customer chooses an available product size
  And Customer clicks the add to bag button
  Then Customer should see the product successfully added to the shopping bag

  Examples:
    | category | productCategory    | price      | product1 | product2 |
    | Men      | New Arrival        | 10.000.000 | Bags     | Watches  |
 
 
