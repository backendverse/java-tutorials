import shorts.Person;
import shorts.PersonDto;

void main() {

    Person person = new Person
            ("alice", 9);
    Person person2 = new Person
            ("alice", 9);

    System.out.format("Record Name => [%s] Age => [%s]\n", person.name(), person.age());
    System.out.println(person);
    System.out.println("Record => " + person.equals(person2));

    PersonDto personDto = new PersonDto("1", "a");
    PersonDto personDto2 = new PersonDto("1", "a");

    System.out.println("Class => " + personDto.equals(personDto2));

}