static class PersonClass implements Cloneable{
    public String id;
    public List<String> name;

    public PersonClass() {
    }

    public PersonClass(String id, List<String> name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonClass{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public PersonClass clone() throws CloneNotSupportedException {
//        return (PersonClass) super.clone();
//    }

//    @Override
//    public PersonClass clone() {
//        try {
//            PersonClass clone = (PersonClass) super.clone();
//            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }


    @Override
    public PersonClass clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            PersonClass clone =
                    (PersonClass) super.clone();
            clone.name = new ArrayList<>(clone.name);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


}

void main() throws CloneNotSupportedException {
    PersonClass personClass = new PersonClass("1", new ArrayList<>(List.of("a")));

    System.out.println("Main Object => " + personClass);

    PersonClass clone = personClass.clone();
    clone.name.add("b");
    System.out.println("Clone Object => " + clone);

    System.out.println("After Modification");

    System.out.println("Main Object => " + personClass);
}
