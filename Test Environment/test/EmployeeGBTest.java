import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EmployeeGBTest {

	@Test
	void hiringBonus() {
		Employee e = new Employee(1993, 4000);
		int actual = e.bonus(2020);
		int expected = 8000;
		assertEquals(expected, actual);
	}

}
