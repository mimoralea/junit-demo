public class Engineer extends Employee {

    // Engineers make lots of money
    public double getYearlySalary() {
	if (this.yearlySalary < 150000)
	    return 225000;
	return this.yearlySalary;
    }

    // Engineers can hack the payroll system
    public void setYearlySalary(double yearlySalary) {
	this.yearlySalary = yearlySalary*1.20;
    }
}
