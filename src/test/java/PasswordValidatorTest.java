import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PasswordValidatorTest {
    String password = "Valid123!";

    @Test
    public void testValidPassword() {
        String expected = "Valid password";
        String actual = PasswordValidator.validatePassword(password);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidPasswordShortLength() {
        String expected = "Invalid password\n- Must be at least 8 characters long.\n";
        String actual = PasswordValidator.validatePassword(password);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidPasswordNoUppercase() {
        String expected = "Invalid password\n- Must contain capital letters.\n";
        String actual = PasswordValidator.validatePassword(password);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidPasswordNoSpecialCharacter() {
        String expected = "Invalid password\n- Must contain special character.\n";
        String actual = PasswordValidator.validatePassword(password);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidPasswordNoNumber() {
        String expected = "Invalid password\n- Must contain a number.\n";
        String actual = PasswordValidator.validatePassword(password);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidPasswordNoLowercase() {
        String expected = "Invalid password\n- Must contain lowercase letters.\n";
        String actual = PasswordValidator.validatePassword(password);
        assertEquals(expected, actual);
    }
}
