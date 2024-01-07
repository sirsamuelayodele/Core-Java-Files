import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Custom exception class
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// Class name should be "Source"
public class Praticals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declare the variable
        int rechargeAmount;

        // Read the variable from STDIN
        rechargeAmount = in.nextInt();

        try {
            validateAmount(rechargeAmount);
            System.out.println("Amount Deposited");
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to validate the recharge amount
    private static void validateAmount(int amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid Amount");
        }
    }
}