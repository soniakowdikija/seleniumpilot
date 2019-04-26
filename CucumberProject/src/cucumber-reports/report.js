$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/casestudy2.feature");
formatter.feature({
  "name": "casestudy2",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "payment order",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "Casestudy2stepdef.login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Larry added a headphone to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "Casestudy2stepdef.larry_added_a_headphone_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "checkout for the payment",
  "keyword": "And "
});
formatter.match({
  "location": "Casestudy2stepdef.checkout_for_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills transaction details",
  "keyword": "And "
});
formatter.match({
  "location": "Casestudy2stepdef.fills_transaction_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the product is successfully ordered",
  "keyword": "Then "
});
formatter.match({
  "location": "Casestudy2stepdef.the_product_is_successfully_ordered()"
});
formatter.result({
  "status": "passed"
});
});