import shorts.Employee;

void main() {

//   Find Average Salary Of Emp By Department Using Stream API
    List<Employee> employees = Arrays.asList(
new Employee("Amit", "IT", 70000),
new Employee("Neha", "HR", 50000),
new Employee("Ravi", "IT", 80000),
new Employee("Priya", "DEV",60000),
new Employee("Raj", "HR", 55000)
    );

    Map<String, Double> collect = employees.stream().collect(
            Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.averagingDouble(Employee::getSalary)
            )
    );

    System.out.println(collect);

}