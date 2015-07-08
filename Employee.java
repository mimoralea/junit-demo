public abstract class Employee {
    protected double yearlySalary;

    private String firstName;
    private String lastName;
    private String employeeId;
    private int age;

    public Employee() {
	this.employeeId = "000000";
	this.yearlySalary = 200000;
    }

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

    abstract double getYearlySalary();
    abstract void setYearlySalary(double yearlySalary);
}
