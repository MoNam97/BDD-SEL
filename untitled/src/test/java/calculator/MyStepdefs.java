package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private double result;
    private String error;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
        error = "";
    }

    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
        System.out.println(result);
    }

    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, (int)result);
    }

    @Then("^I expect the result (-?\\d+\\.\\d+)$")
    public void iExpectTheResult(double arg0) {
        if (!error.isEmpty())
            Assert.fail();
        Assert.assertEquals(String.format("%.2f",arg0), String.format("%.2f", result));
    }

    @Then("^I expect the result ([a-zA-Z]+)$")
    public void iExpectTheResult(String arg0) {
        if (error.isEmpty())
            Assert.fail();
        Assert.assertEquals(arg0, error);
    }

    @When("^I X the two values$")
    public void iXTheTwoValues() {
        try{
            result = calculator.X(value1, value2);
        } catch (Exception e){
            error = e.getMessage();
        }

    }
}
