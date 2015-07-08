import org.junit.*;
import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void engineerMinimumSalary() {
	Engineer en1 = new Engineer();
	en1.setYearlySalary(50000);

	Engineer en2 = new Engineer();
	en2.setYearlySalary(100000);

	assertTrue(en1.getYearlySalary() == 225000);
	assertTrue(en2.getYearlySalary() == 225000);
    }

    @Test
    public void managerMinimumSalary() {
	Manager ma1 = new Manager();
	ma1.setYearlySalary(150000);

	Manager ma2 = new Manager();
	ma2.setYearlySalary(250000);

	assertTrue(ma1.getYearlySalary() == 500000);
	assertTrue(ma2.getYearlySalary() == 500000);
    }

    @Test
    public void engineerHackedSetSalary() {
	Engineer en1 = new Engineer();
	en1.setYearlySalary(250000);

	Engineer en2 = new Engineer();
	en2.setYearlySalary(400000);

	assertTrue(en1.getYearlySalary() > 250000);
	assertTrue(en2.getYearlySalary() > 400000);
    }

    @Test
    public void managerHackedSetAge() {
	Manager ma1 = new Manager();
	ma1.setAge(30);

	Manager ma2 = new Manager();
	ma2.setAge(58);

	assertTrue(ma1.getAge() == 50);
	assertTrue(ma2.getAge() == 58);
    }
}
