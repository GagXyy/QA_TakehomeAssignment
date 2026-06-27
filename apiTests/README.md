# API Automation Framework

## Project Overview

This project automates REST API testing using **Rest Assured**, **Java**, **TestNG**, and **Maven**. The framework validates API responses by verifying HTTP status codes, response fields, and error scenarios using the JSONPlaceholder public REST API.

The framework is designed using reusable components such as a Base API class, configuration management, and payload objects to improve maintainability and scalability.

---

## Tech Stack

* Java 18
* Rest Assured
* TestNG
* Maven
* JSONPlaceholder REST API

---


## Automated API Test Scenarios

### TC_API_001 – Verify GET User API

**Endpoint**

```
GET /posts/1
```

**Validations**

* Status Code is 200
* User ID is validated
* Post ID is validated
* Title field is not null

---

### TC_API_002 – Verify Create User API

**Endpoint**

```
POST /posts
```

**Validations**

* Status Code is 201
* Title is validated
* User ID is validated
* Generated ID is returned

---

### TC_API_003 – Verify Invalid Request

**Endpoint**

```
GET /posts/999999
```

**Validations**

* Status Code is 404

---

## Framework Design

The framework follows a reusable architecture.

* **BaseAPI** – Initializes the Base URL and Request Specification.
* **ConfigReader** – Reads configuration values from the properties file.
* **UserPayload** – POJO class used for API request payloads.
* **UserAPITest** – Contains API test cases executed using TestNG.

---


Example:

```properties
baseUrl=https://jsonplaceholder.typicode.com
```

---

## How to Execute

### Using Eclipse

click on UserAPITest.java -> and Run as TestNg test

---

## Reports

After execution, TestNG automatically generates reports in:

```
test-output/
```

Important reports:

* index.html
* emailable-report.html

---

## Features

* Rest Assured
* Java
* TestNG
* Maven
* Reusable Base API
* POJO Request Payload
* Configuration using Properties File
* HTTP Status Code Validation
* Response Field Validation
* TestNG HTML Reports

---

## Author

**Gagan AC**
