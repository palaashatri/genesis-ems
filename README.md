# genesis-ems
# Employee Management System





![Banner](https://github.com/netizener/genesis-ems/blob/main/5_ImagesAndVideos/images/EMS_Banner.png)





## Features of the application
It provides you with following features:
* It allows employee to update some of his details with certain restrictions.
* It allows employee to send attendance request for regularisation.
* It allows admin to do basic CRUD operations on employee.
* It allows admin to accept/reject employee's attendance.








## Folder Structure
Folder             | Description
-------------------| -----------------------------------------
`1_Requirements`      | Contains Reasearch,SWOT Analysis,4W's 1H, High and Low Level Requirement Analysis
`2_Architecture`      | Contains High and Low Level Diagrams
`3_Implementation`    | Contains Actual Code
`4_TestPlanAndOutput` | Contains Test Plan
`5_ImagesAndVideos`   | Contains EMS Video
`6_Others`            | -
`7_Report`            | Contains Report and PPT 











## Contributors List and Summary
PS No. |  Name   |    Features    | Issuess Raised |Issues Resolved|
---------|-------------|----------------|----------------|---------------
`99004924` | Supriya Yadav  | - | 0   | 0  
`99004930` | Palaash Atri  | - | 0   | 0  
`99004934` | Mayank Gupta  | - | 0   | 0  
`99004936` | Shubham Phansekar  | - | 0   | 0  




## Pre-requisites:

 1. Download & Install Java 11
 2. Download & Install Spring Tool Suite
 3. Download & Install MySQL 8.0.* 
  

## How to run:

 1. Clone the repository
  ```
  git clone https://github.com/netizener/genesis-ems.git
  ```
 2. Open the directory in Spring Tool Suite
 3. Open MySQL command-line and create database using following command
  ```
  create database ems;
  ```

 4. Change the following fields for MySQL db in `application.properties` to match with your local machine configuration :
 ```
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/ems
spring.datasource.username=
spring.datasource.password=
 ```
 5. For Running the application, run `EmsApplication.java` file
 6. After the web application starts successfully, go to [localhost:8989](http://localhost:8989) in your browser to view the application




