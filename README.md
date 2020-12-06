# UI and API tests in Java with Selenium and Cucumber #

## Introduction ##
This project/framework is made to run UI and API functional tests against the website https://coinmarketcap.com/ .
It is a BDD project based on cucumber and uses Java and Selenium for automation.
The project implements Page Object Model(POM) for UI tests.

Cucumber feature files having test scenarios are described in the files: ./src/test/resources.

Please follow below steps to set up the project and run the tests

## Installation ##

You need to have java8 and maven installed.

For running the tests locally with Chrome, install ChromeDriver from [here](http://chromedriver.chromium.org), add its location to root directory of project

For running the tests locally with Firefox, install GeckoDriver from [here](https://github.com/mozilla/geckodriver/releases),add its location to root directory of project

For running the tests locally with InternetExplorer, install GeckoDriver from [here](https://www.selenium.dev/downloads/),add its location to root directory of project

To install all dependencies, run 

```console
$ mvn clean install
```

## Running tests ##

Very important: Generate API-KEY for https://coinmarketcap.com/ and put that in here : src/test/main/resources/config.properties

By default, tests will run on Chrome. It can be run on firefox , IE by making change to the 'browser' property in src/test/main/resources/config.properties 


```console
$ mvn surefire-report:report
```

Test reports in html format will be generated at .target/site/surefire-report.html