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
}
