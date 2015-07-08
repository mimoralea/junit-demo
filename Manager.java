public class Manager extends Employee {

    public double getYearlySalary() {
	if (this.yearlySalary < 300000)
	    return 500000;
	return this.yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
	this.yearlySalary = yearlySalary;
    }

    public int getAge() {
	if (super.getAge() < 50)
	    return 50;
	return super.getAge();
    }
}
