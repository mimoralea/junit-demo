/* abstract class cannot be instantiated
 * this class must be inherited in order to
 * be used */
public abstract class Employee {
    // protected properties are only visible to the
    // current class and its descendants
    protected double yearlySalary;

    // private properties are only accessible within the
    // current class
    private String firstName;
    private String lastName;
    private String employeeId;
    private int age;

    // Employee constructor
    // sets the default values for
    // all kinds of employees
    public Employee() {
	this.employeeId = "000000";
	this.yearlySalary = 200000;
    }

    /* Getters and setters BEGIN */
    public String getFirstName() {
	return this.firstName;
    }

    public String getLastName() {
	return this.lastName;
    }

    public String getFullName() {
	return this.getFirstName() + " " + this.getLastName();
    }

    public String getEmployeeId() {
	return this.employeeId;
    }

    public int getAge() {
	return this.age;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
    }

    public void setAge(int age) {
	this.age = age;
    }
    /* Getters and setters END */


    // abstract methods that will have to be overridden
    // by classes inheriting the current
    abstract double getYearlySalary();
    abstract void setYearlySalary(double yearlySalary);
}
