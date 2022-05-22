public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalArgumentException, IllegalStateException {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
        if (this.name == null || this.surname == null) {
            throw new IllegalStateException();
        }
        Person result = age > 0 ? new Person(name, surname, age) : new Person(name, surname);
        if (address != null) {
            result.setAddress(address);
        }
        return result;
    }
}
