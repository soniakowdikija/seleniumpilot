Feature: casestudy2
Scenario: payment order
Given login with valid credentials
When Larry added a headphone to the cart
And checkout for the payment
And fills transaction details
Then the product is successfully ordered
