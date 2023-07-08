$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/SwagLabs.feature");
formatter.feature({
  "name": "testSwagLabs",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "testSwagLabs",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@aaa"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "open url and login",
  "keyword": "Given "
});
formatter.match({
  "location": "Hookstep.SwagTest.open_url_and_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add product to cart",
  "keyword": "When "
});
formatter.match({
  "location": "Hookstep.SwagTest.addProductToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to Cart and Checkout",
  "keyword": "And "
});
formatter.match({
  "location": "Hookstep.SwagTest.goToCartAndCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "input rceiving address",
  "keyword": "And "
});
formatter.match({
  "location": "Hookstep.SwagTest.inputRceivingAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "checkout Overview",
  "keyword": "Then "
});
formatter.match({
  "location": "Hookstep.SwagTest.checkoutOverview()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});