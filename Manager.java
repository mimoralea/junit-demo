public class Manager extends Employee {

    // managers should get the most money
    public double getYearlySalary() {
	if (this.yearlySalary < 300000)
	    return 500000;
	return this.yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
	this.yearlySalary = yearlySalary;
    }

    // manager should always look older
    public int getAge() {
	if (super.getAge() < 50)
	    return 50;
	return super.getAge();
    }
}
