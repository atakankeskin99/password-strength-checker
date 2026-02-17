package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void begubebek_ShouldReturnStrongScore5() {
        assertEquals(5, Main.calculateStrength("begubebek"));
    }

    @Test
    void begucuk_ShouldReturnStrongScore5() {
        assertEquals(5, Main.calculateStrength("begucuk"));
    }

    @Test
    void weakPassword_ShouldReturnWeak() {
        int score = Main.calculateStrength("abc");
        assertEquals("WEAK", Main.evaluate(score));
    }

    @Test
    void mediumPassword_ShouldReturnMedium() {
        int score = Main.calculateStrength("abcdefghi1");
        assertEquals("MEDIUM", Main.evaluate(score));
    }

    @Test
    void strongPassword_ShouldReturnStrong() {
        int score = Main.calculateStrength("Abcdefghi1!");
        assertEquals("STRONG", Main.evaluate(score));
    }

    @Test
    void needsSuggestion_ShouldWorkCorrectly() {
        assertTrue(Main.needsSuggestion("WEAK"));
        assertTrue(Main.needsSuggestion("MEDIUM"));
        assertFalse(Main.needsSuggestion("STRONG"));
    }

    @Test
    void generateStrongPassword_ShouldAlwaysBeStrong() {
        String p = Main.generateStrongPassword();
        int score = Main.calculateStrength(p);
        assertEquals("STRONG", Main.evaluate(score));
        assertTrue(p.length() >= 12);
    }

    // ✅ NEW TESTS for getMissingCriteria()

    @Test
    void getMissingCriteria_For1234_ShouldMentionUpperLowerSpecialAndLength() {
        String feedback = Main.getMissingCriteria("1234");

        assertTrue(feedback.contains("At least one uppercase letter"));
        assertTrue(feedback.contains("At least one lowercase letter"));
        assertTrue(feedback.contains("At least one special character"));
        assertTrue(feedback.contains("Minimum length of 9 characters"));
    }

    @Test
    void getMissingCriteria_ForStrongPassword_ShouldBeEmpty() {
        String feedback = Main.getMissingCriteria("Abcdefghi1!");
        assertEquals("", feedback);
    }

    @Test
    void getMissingCriteria_ForMissingDigit_ShouldMentionDigit() {
        String feedback = Main.getMissingCriteria("Abcdefghi!!");

        assertTrue(feedback.contains("At least one digit"));
    }
}
