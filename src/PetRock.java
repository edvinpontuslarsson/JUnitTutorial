/*
* To make folder a test folder,
* File -> Project Structure -> Modules
*
* Click to mark tests folder & then flag it "Tests" & hit OK
* */

// to toggle between files:
// ctrl+alt

// click to mark Class name
// then create tests with:
// alt + enter

/*
* If JUnit not found, fix & download
* */

/*
* Fill in which methods to create tests for,
* select tests folder
* */
public class PetRock {
    private String name;
    private boolean happy = false;

    // for auto generating constructor/get/set:
    // alt + insert

    public PetRock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        // click, alt + enter to create field
        return happy;
    }

    public void playWithRock() {
        happy = true;
    }
}
