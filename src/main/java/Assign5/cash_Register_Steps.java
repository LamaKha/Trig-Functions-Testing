package Assign5;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class cash_Register_Steps {
    //declaring variables
    private cashRegister cash_Register;
    private int actualSum;
    //Initiating a Calculator object
    //Here we translate the Given part
    @Given("^I have a cashRegister$")
    public void intializecashRegister() {
        this.cash_Register = new cashRegister();
    }
    //Using the Calculator to add the numbers
    //Here we translate the When part
    @When("^I add (-?\\d) and (-?\\d)$")
    public void whenIAddTwoNumbers(int firsItem, int secondItem) {
        this.actualSum = this.cash_Register.add(firsItem, secondItem);
    }
    //Comparing the result of the expected result
    //Here we translate the Then section
    @Then("^the sum should be (-?\\d)$")
    public void thenTheSumShouldBe(int expectedSum) {
        assertEquals((expectedSum),this.actualSum);
    }
}



