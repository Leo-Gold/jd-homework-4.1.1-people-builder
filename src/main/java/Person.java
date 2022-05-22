import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = 0;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return age > 0;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(this.age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        age++;
    }

    public PersonBuilder newChildBuilder() {
        int newAge = age;
        String newAddress = address;
        PersonBuilder result = new PersonBuilder();
        result
                .setName(name)
                .setSurname(surname)
                .setAge(newAge = 0)
                .setAddress(newAddress = null);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(name).append(' ').append(surname);
        if (hasAge()) {
            result.append(", возраст ").append(age);
        }
        if (hasAddress()) {
            result.append(", живет в ").append(address);
        }
        return result.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
