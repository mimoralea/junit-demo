public class Engineer extends Employee {

    public double getYearlySalary() {
	if (this.yearlySalary < 150000)
	    return 225000;
	return this.yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
	this.yearlySalary = yearlySalary*1.20;
    }
}
