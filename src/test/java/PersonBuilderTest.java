import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonBuilderTest {

    @Test
    void buildTestAgeNotValid() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setName("имя").setSurname("фамилия");
        Assertions.assertThrows(IllegalArgumentException.class, () -> personBuilder.setAge(-100).build() );
    }

    @Test
    void  buildTestNoName() {
        PersonBuilder personBuilder = new PersonBuilder();
        Assertions.assertThrows(IllegalStateException.class, personBuilder::build);
    }

    @Test
    void buildTestIsValid() {
        PersonBuilder personBuilder = new PersonBuilder();
        String actual = personBuilder.setName("Name").setSurname("Surname").build().toString();
        String expected = "Name Surname";
        Assertions.assertEquals(expected, actual);
    }
}
