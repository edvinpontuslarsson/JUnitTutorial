import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {

    @Test
    void getName() throws Exception {
        PetRock rocky = new PetRock("Rocky");

        assertEquals("Rocky", rocky.getName());
    }

    // to generate test method:
    // alt + insert

    
}