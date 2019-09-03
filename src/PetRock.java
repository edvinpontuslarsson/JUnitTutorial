/*
* To make folder a test folder,
* File -> Project Structure -> Modules
*
* Click to mark tests folder & then flag it "Tests" & hit OK
* */

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

    // for auto generating constructor/get/set:
    // alt + insert

    public PetRock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
