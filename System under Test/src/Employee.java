public class Employee {

	public static final int FOUNDING_YEAR = 1990;

	private int salary, yearOfHiring;
	
	public static String version(){
		return "2"; 
	}

	public Employee(int yearOfHiring, int salary) {
		if(salary < 0)
			throw new RuntimeException("Negative salary.");
		if(yearOfHiring < FOUNDING_YEAR)
			throw new RuntimeException("Wrong entry year.");

		this.yearOfHiring = yearOfHiring;
		this.salary = salary;
	}

	public int bonus(int yearOfCalculation) {
		 if(yearOfHiring > yearOfCalculation)
			 throw new RuntimeException("Wrong calculation year.");

		int affiliation = yearOfCalculation - yearOfHiring;

		double factor = 0;
		if (affiliation <= 3)
			factor = 0;
		else if (affiliation <= 5)
			factor = 0.5;
		else if (affiliation <= 8)
			factor = 0.75;
		 else
			 factor = 1;

		// This is my hiring year, so I get an extra bonus
		if (yearOfHiring == FOUNDING_YEAR + 3)
			factor = 2;

		return (int) (salary * factor);
	}
}
