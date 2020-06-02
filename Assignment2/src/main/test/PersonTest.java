import com.company.Person;
import com.company.PersonParser;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void Person_equals_verifyEqualsAndReturnsCorrect() {
        EqualsVerifier.forClass(Person.class).verify();
    }

    @Test
    public void PersonParser_toJsonAndFromJson_isCorrectObjectAfterDesirializingAndReturnsCorrect() {
        Person expected = new Person("34320-57-24", "Bogdan", "Prokaza", 19);
        String serializedObject = PersonParser.serializeInJson(expected);
        Person actual = PersonParser.desiarilizeFromJson(serializedObject);
        Assert.assertEquals(expected, actual);
    }
}
