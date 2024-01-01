import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import main.java.regex.Regex;

public class Junit {
    @Test
    public void testFirstNameHappy(){
        String input = "Roop";
        Regex regex = new Regex();
        assertTrue(regex.validFirstName(input));
    }

    @Test
    public void testFirstNameSad(){
        String input = "roop";
        Regex regex = new Regex();
        assertFalse(regex.validFirstName(input));
    }

    @Test
    public void testLastNameHappy(){
        String input = "Lala";
        Regex regex = new Regex();
        assertTrue(regex.validLastName(input));
    }

    @Test
    public void testLastNameSad(){
        String input = "lala";
        Regex regex = new Regex();
        assertFalse(regex.validLastName(input));
    }

    @Test
    public void testEmailHappy(){
        String input = "roop.lala112233@gmail.com";
        Regex regex = new Regex();
        assertTrue(regex.validEmail(input));
    }

    @Test
    public void testEmailSad(){
        String input = "roop@gmail";
        Regex regex = new Regex();
        assertFalse(regex.validEmail(input));
    }

    @Test
    public void testMobileHappy(){
        String input = "91 0123456789";
        Regex regex = new Regex();
        assertTrue(regex.validMobile(input));
    }

    @Test
    public void testMobileSad(){
        String input = "0123456789";
        Regex regex = new Regex();
        assertFalse(regex.validMobile(input));
    }

    @Test
    public void testPasswordHappy(){
        String input = "Roop@Apple123";
        Regex regex = new Regex();
        assertTrue(regex.validPassword(input));
    }

    @Test
    public void testPasswordSad(){
        String input = "roop@apple";
        Regex regex = new Regex();
        assertFalse(regex.validPassword(input));
    }
}
