# Specification

A company has a program commissioned which should calculate the Christmas bonus of the employees depending on the company affiliation. In the description of the requirements the following excerpt can be found:

“Employees working for three years at the company will receive a bonus of 50% of their monthly salary as Christmas bonus. Employees, who work for more than five years in the company, will receive 75%, with a corporate affiliation of more than eight years a bonus of 100% will be granted.”
The design provides the following specifications:

A class Employee is to be realized. The class should hold two attributes: yearOfHiring and salary (both of type int). With the help of the constructor Employee(int yearOfHiring, int salary) both are set. An instance method bonus(int yearOfCalculation) provides the bonus of the employee (as an integer) for the calculation year as a result.

If the constructor receives a wrong entry year (prior to its foundation in 1990) or a negative salary, an exception (RuntimeException) is to be thrown. If an incorrect year is entered (before entering year) when calculating the bonus, an exception should be thrown, too.