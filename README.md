# Bank Application Automation - Cucumber BDD Framework

This project automates a Banking Web Application using Selenium WebDriver with Java and Cucumber BDD framework.

---

## Technologies Used
- Java
- Selenium WebDriver
- Cucumber BDD
- Maven
- TestNG
- Eclipse IDE

---

## Project Setup (From Scratch)

Follow the below steps to create and run this automation project.

### 1. Install Java
Download and install JDK from the official website.

Check installation using:

---

### 2. Install Eclipse IDE
Download Eclipse IDE for Java Developers and install it.

---

### 3. Install Maven
Download Maven and configure it.

Check Maven installation:

---

### 4. Create Maven Project in Eclipse

Steps:

1. Open Eclipse  
2. Click **File → New → Maven Project**  
3. Select **maven-archetype-quickstart**  
4. Enter:


GroupId: automation
ArtifactId: BankApplicationCucumber

5. Click **Finish**

---

### 5. Add Dependencies in pom.xml

Add the following dependencies in **pom.xml**

```xml
<dependencies>

<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-java</artifactId>
<version>4.18.1</version>
</dependency>

<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-java</artifactId>
<version>7.15.0</version>
</dependency>

<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-testng</artifactId>
<version>7.15.0</version>
</dependency>

<dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>7.9.0</version>
</dependency>

</dependencies>

After adding dependencies → Right click project → Maven → Update Project

PROJECT STRUCTURE

src/test/java
   runner
      TestRunner.java

   stepdefinitions
      Guru99Steps.java

src/test/resources
   features
      guru99.feature

pom.xml

Test Scenarios Automated

1.The following banking application workflows are automated:

2.Launch Browser

3.Login with Username and Password

4.Add New Customer

5.Edit Customer Details

6.Create New Account

7.Logout from the Application



EXECUTING:

How to Run the Project

Open the project in Eclipse.

Navigate to:
runner → TestRunner.java

Right click Run As → TestNG Test

Automation scenarios will start executing.
