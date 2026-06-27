# OrangeHRM UI Automation Framework

## Project Overview

This project automates the Login module of the OrangeHRM Demo application using Selenium WebDriver, Java, TestNG, Maven, and the Page Object Model (POM).

The framework follows industry-standard automation practices with reusable page classes, configuration management, and explicit waits.

---

## Tech Stack

* Java 18
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* WebDriverManager

---


## Automated Test Scenarios

### TC_001 - Verify login with valid username and password

**Expected Result**

* User should be successfully logged in.
* Dashboard page should be displayed.

---

### TC_002 - Verify user can log out successfully

**Expected Result**

* User should be logged out.
* Login page should be displayed.

---

### TC_003 - Verify login with invalid username

**Expected Result**

* Invalid credentials message should be displayed.

---

## Design Pattern

The framework follows the Page Object Model (POM) design pattern.

* BaseClass -     handles browser initialization and teardown.
* ConfigReader -  manages application configuration.
* LoginPage -     contains login-related actions.
* DashboardPage - contains dashboard and logout actions.
* LoginTest -     contains the TestNG test cases.


---

## How to Execute

### Using Eclipse

* Right-click `testng.xml`
* Select **Run As → TestNG Suite**

### Using Maven

```
mvn clean test
```

---

## Reports

After execution, TestNG generates reports automatically.

```
test-output/
```

Important reports:

* index.html
* emailable-report.html

---

## Features

* Selenium WebDriver
* TestNG Framework
* Maven Build Management
* Page Object Model (POM)
* PageFactory
* Explicit Waits
* External Configuration using Properties File
* WebDriverManager Integration
* Reusable Page Classes
* TestNG HTML Reports

---

## Author

Gagan AC
