import shorts.Student;

void main() {

    // Find top 2 student from each department,
    // sorted by rank in ascending
    List<Student> students = new ArrayList<>();

    // CSE - {Aakash, Neha}
    students.add(new Student("S02", "Neha", "CSE", 2, 22, "neha@college.com"));
    students.add(new Student("S01", "Aakash", "CSE", 1, 21, "aakash@college.com"));
    students.add(new Student("S03", "Rohan", "CSE", 4, 20, "rohan@college.com"));

    //MECH - {Arjun, Priya}
    students.add(new Student("S07", "Priya", "MECH", 2, 24, "priya@college.com"));
    students.add(new Student("S08", "Meera", "MECH", 5, 22, "meera@college.com"));
    students.add(new Student("S09", "Arjun", "MECH", 1, 23, "arjun@college.com"));

    //ECE - {Ravi, Sakshi}
    students.add(new Student("S10", "Sakshi", "ECE", 2, 21, "sakshi@college.com"));
    students.add(new Student("S11", "Manish", "ECE", 3, 22, "manish@college.com"));
    students.add(new Student("S12", "Ravi", "ECE", 1, 23, "ravi@college.com"));

    students.stream().collect(Collectors.groupingBy(
            Student::getDepartment,
            Collectors.collectingAndThen(Collectors.toList(), list -> {
                return list.stream().sorted(Comparator.comparingInt(Student::getRank)).limit(2).toList();
            })
    )).values().stream().flatMap(Collection::stream).forEach(System.out::println);

}