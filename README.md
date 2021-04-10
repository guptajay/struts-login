# Assignment 2 - Login with Apache Struts & MySQL
> CZ3002 Advanced Software Engineering  
> School of Computer Science and Engineering  
> Nanyang Technological University, Singapore 

### Organization

The code is primarily divided in 3 segments: Model (`LoginModel.jsp`), View (`index.jsp`, `Welcome.jsp`), and Controller (`LoginAction.jsp`). 
For the Struts 2 Framework, a `struts.xml` file is made for configuration management. It maps all the actions to different routes as part of the wire-by-configuration feature.

### Installation
Make sure you have the following dependencies available:
* Linux, Mac OS X, or Windows.
* JAVA SE Development Kit 8
* MySQL Community Server 8.0.23
* Apache Maven 3.8.1

Run the following steps to set up your environment:
* To set up the MySQL Database, turn on the database server. Run `mysql -u <USERNAME> -p` command. Run the SQL queries given in the SQL script `LoginDB.sql`.
* To start the application, run `mvn jetty:run`
* In a web browser go to `http://localhost:8080/login-struts/index.action`.

### User Manual
The application features a Login feature, where the user is required to enter their credentials, consisting of a username and password, to successfully log in.
In a case of a successful login, the user is directed to a welcome page and greeted with a  ‘Successful Login’ message. Otherwise, the user is redirected back to the home page with an ‘Unsuccessful Login’ message. 

As per the predefined SQL queries, these credentials will result in a successful login:
* Username: `jaygupta`
* Password: `password` 
