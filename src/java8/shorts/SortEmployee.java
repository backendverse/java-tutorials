import java8.shorts.Employee;

void main() {

//   Sort Employees By Salary Using Stream API
  List<Employee> employees = Arrays.asList(
 new Employee("Amit", "IT", 70000),
 new Employee("Neha", "HR", 50000),
 new Employee("Ravi", "IT", 80000),
 new Employee("Arun", "DEV", 60000),
 new Employee("Raj", "HR",   55000)
 );

  employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);

}