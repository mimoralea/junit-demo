public class Payroll {

    public static void main(String args[]) {
	Engineer eng = new Engineer();
	eng.setFirstName("John");
	eng.setLastName("Johnson");
	eng.setAge(20);
	eng.setEmployeeId("12345678");
	eng.setYearlySalary(225000);
	
	System.out.println("Engineer registered successfully:\n" +
			   "\tName:\t" + eng.getFullName() + "\n" +
			   "\tAge:\t" + eng.getAge() + "\n" +
			   "\tSalary\t$" + eng.getYearlySalary());
	System.out.println();

	Manager man = new Manager();
	man.setFirstName("Peter");
	man.setLastName("Peterson");
	man.setAge(30);
	man.setEmployeeId("87654321");
	man.setYearlySalary(500000);
	
	System.out.println("Manager registered successfully:\n" +
			 "\tName:\t" + man.getFullName() + "\n" +
			 "\tAge:\t" + man.getAge() + "\n" +
			 "\tSalary\t$" + man.getYearlySalary());
    }
}
