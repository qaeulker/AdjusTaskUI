Feature: Adjust Task

  @adjust
  Scenario:User should search a word on the webpage
    When user navigates to "https://en.wikipedia.org/w/index.php?search" page
    Then verify that the page title is "Search - Wikipedia"
    When user searches for "Google"
    Then verify that user sees the results for "Google"

  Scenario:User can be use filter Advanced search
    When user navigates to "https://en.wikipedia.org/w/index.php?search" page
    Then verify that the page title is "Search - Wikipedia"
    When user write "Google" in searchbox
    And user clicks "Advanced search"
    And user clicks "These Words Box"
    When user writes "news" in These Words Box
    And user clicks search button
    Then verify that the page title is "Google news"


  Scenario:User can be use filter search in
    When user navigates to "https://en.wikipedia.org/w/index.php?search" page
    Then verify that the page title is "Search - Wikipedia"
    When user write "Google" in searchbox
    And user clicks "Search in"
    And user clicks "All checkBox"
    When user clicks search button
    Then verify that the page title is "Google"

