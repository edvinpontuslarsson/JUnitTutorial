import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {
    private PetRock rocky = new PetRock("Rocky");

    @Test
    void getName() {
        assertEquals("Rocky", rocky.getName());
    }

    // to generate test method:
    // alt + insert


    @Test
    void testUnhappyToStart() {
        /*
        * alt+enter on missing (not yet created method)
        * Choose create method
        * */

        // Can run only 1 test method with:
        // With Run->Run...
        assertFalse(rocky.isHappy());
    }

    @Test
    void testHappyAfterPlay() {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }
}