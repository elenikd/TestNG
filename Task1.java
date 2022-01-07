package Class1HW1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 {

    /** Task 1 : Excuting test using @Test
     *           * Create three tests with unique @test methods manes.
     *           * Execute all test methods
      */



    @Test
    public void BankName() {
        System.out.println("Chase Bank");

    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am PreCondition");

    }
    @Test
    public void AccountNumber() {
        System.out.println("It 3456789");

    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("I am PostCondition");

    }
    @Test
    public void Deposit() {
            System.out.println("To checking Account");

        }
    }








