$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/adjust.feature");
formatter.feature({
  "name": "Adjust Task",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should search a word on the webpage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@adjust"
    }
  ]
});
formatter.step({
  "name": "user navigates to \"https://en.wikipedia.org/w/index.php?search\" page",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify that the page title is \"Search - Wikipedia\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user searches for \"Google\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify that user sees the results for \"Google\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});