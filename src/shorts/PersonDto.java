package shorts;

public final class PersonDto {

    private final String id;
    private final String name;

    // constructors
    // getters
    // toString
    // equals
    // hashcode

    public PersonDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        PersonDto personDto = (PersonDto) o;
//        return Objects.equals(id, personDto.id) && Objects.equals(name, personDto.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }

}
