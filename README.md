# junit-demo
Easy self-contained junit demo on a payroll application with basic object oriented programming


## To execute locally:

* clone the repository

        git clone git@github.com:mimoralea/junit-demo.git


* compile the application

        javac Payroll.java


* test it out

        java Payroll


* compile the tests

        javac -cp .:junit-4.12.jar EmployeeTest.java


* run the tests
	
        java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore EmployeeTest
