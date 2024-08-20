# Author: reynaldi.octavially@gmail.com

Feature: Product Checkout

@productCheckout
Scenario Outline: Successfully checkout and paid using bank transfer
  Given Customer clicks checkout button
  When Customer select shipping method "<shippingMethod>"
  And Customer select payment method with bank transfer "<paymentMethod>"
  And Customers clicks confirm payment method button
  And Customer verify order summary
  And Customer clicks place order button
  And Customer verify amount for payment
  Then Customer successfully checkout and paid using bank transfer

  Examples:
    | shippingMethod | paymentMethod |
    | JNE            | BRI           |
 
 
