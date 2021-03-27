# Automation Practice Test Project with Selenium WebDriver + Java

#### Prerequisites
- Have JDK installed on the machine
- Have maven installed on the machine
- Have Java and Maven environment variables set on machine
- Download the project to the machine in directory "C:"

#### Run project
1. Run the project open cmd
2. Change directory to "C:\automationPractice"
3. Run the mvn clean command:
```sh
mvn clean
```
4. Run mvn test command:
```sh
mvn test
```
##### Run separate features
Run LoginTest:
```sh
mvn -Dtest=LoginTest test
```
Run RegisterCustomerTest:
```sh
mvn -Dtest=RegisterCustomerTest test
```
#### View BDDS
Access the following path "C:\automationPractice\src\test\resources\features"
- LoginTest.feature
- RegisterCustomerTest.feature

#### View logs
Access the following path "C:\automationPractice\target\surefire-reports"
- tests.LoginTest.txt
- TEST-tests.LoginTest.xml
- tests.RegisterCustomerTest.txt
- TEST-tests.RegisterCustomerTest.xml