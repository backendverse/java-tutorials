import shorts.Employee;

void main() {
    //   Find Second-Highest Salary From List Of Employee Using Stream API


 List<Employee> employees = Arrays.asList(
 new Employee("Amit", "IT", 70000),
 new Employee("Neha", "HR", 50000),
 new Employee("Ravi", "IT", 80000),
 new Employee("Priya", "DEV", 60000),
 new Employee("Raj", "HR", 55000)
    );

 employees.stream()
         .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
         .skip(1).limit(1)
         .findFirst().ifPresent(System.out::println);

}