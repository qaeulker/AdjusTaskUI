# AdjustTask_JavaCucumber

This test automation framework is created as an ALTERNATE solution for the technical task of Adjust. Test scenarios are written in Gherkin language according to the task to test the home page of wikipedia: https://en.wikipedia.org/w/index.php?search. The codes are written in Java programming language with the implementations of object-oriented-programming (OOP) concepts. Page object model (POM) design pattern is also implemented in the framework.

## Reporting

Reports are generated by cucumber automatically under `/target/default-html-reports` package. Beside that simple reporting, more detailed and fancy reporting is also used in the framework by adding `maven-cucumber-reporting` plug-in inside the pom.xml file. Those reports can be reached under `/target/cucumber-html-reports`. To able to get those fancy reports, the code should be executed through maven lifecyle or from the terminal with the command of `maven verify`. In the case of test failures, a screen-shot of the related page is embedded into the report.

## Tech stack

* Java 1.8
* Maven
* Cucumber 5.7.0
* JUnit 5.7.0
* Selenium Webdriver 3.141.59
* IntelliJ
* GitHub


## How To Execute
### Run The Specific Test Case
1. Go to src/test/resources/features folder
2. Click run test button (triangle icon) next to Scenario

or

1. Add tag above the specific test case i.e. "@adjust"
2. Go to CukesRunner.java class
3. Set tags option as "@adjust"
4. Run CukesRunner.java class

### Run Through Maven
1. Click maven on right side bar
2. Click lifecycle dropdown to expand
3. Click verify goal
