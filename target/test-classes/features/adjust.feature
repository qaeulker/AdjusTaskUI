Feature: Adjust Task

  @adjust
  Scenario:User should search a word on the webpage
    When user navigates to "https://en.wikipedia.org/w/index.php?search" page
    Then verify that the page title is "Search - Wikipedia"
    When user searches for "Google"
    Then verify that user sees the results for "Google"

  Scenario:User can be use filter
    When user navigates to "https://en.wikipedia.org/w/index.php?search" page
    Then verify that the page title is "Search - Wikipedia"



