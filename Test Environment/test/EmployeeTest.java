import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeAll
	public static void info() {
		System.out.println("Employee Version: " + Employee.version());
	}

	@Test
	void noBonus() {
		Employee e = new Employee(2020, 4000);
		int actual = e.bonus(2020);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void halfBonus() {
		Employee e = new Employee(2017, 4000);
		int actual = e.bonus(2017);
		int expected = 2000;
		assertEquals(expected, actual);
	}

	@Test
	void threeQuarterBonus() {
		Employee e = new Employee(2014, 4000);
		int actual = e.bonus(2014);
		int expected = 3000;
		assertEquals(expected, actual);
	}

	@Test
	void fullBonus() {
		Employee e = new Employee(2011, 4000);
		int actual = e.bonus(2011);
		int expected = 4000;
		assertEquals(expected, actual);
	}

	@Test
	void wrongEntryYear() {
		int n = 1989;
		assertThrows(RuntimeException.class, () -> new Employee(n, 4000));
	}

	@Test
	void negativeSalary() {
		int n = -4000;
		assertThrows(RuntimeException.class, () -> new Employee(2011, n));
	}

}
