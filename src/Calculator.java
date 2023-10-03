public class Calculator {

    private String calcModel;

    public Calculator(String model) {
        calcModel = model;
    }

    // method that performs the operation designated by operand (which
    // could be +, -, *, or /) and returns the result of that operation
    // performed between num1 and num2
    // NOTE: if operand is some String other than "+", "-", "*", or "/" then
    // this method should return 0
    // REMINDER: use .equals to test if one string is equal to another (not ==)
    // (THIS METHOD DOES NOT PRINT)
    public double performOperation(String operand, int num1, int num2) {
        if (operand.equals("*")) {
            return ( (double) num1 * num2);
        }
        if (operand.equals("/")) {
            return ( (double) num1 / num2);
        }
        if (operand.equals("+")) {
            return ( (double) num1 + num2);
        }
        if (operand.equals("-")) {
            return  ( (double) num1 - num2);
        }
        return ( (double) num1);
    }
    // method that checks if num1 is evenly divisible by num2, and if so,
    // returns true, and if not, returns false
    // (THIS METHOD DOES NOT PRINT)
    public boolean divisibleBy(int num1, int num2) {
        if ( (num1 % num2) == 0) {
            return true;
        } else {
            return false;
        }
        /* implement me!*/
    }

    // method that constructs and returns a string representing a coordinate
    // pair in the format: "(x, y)"
    // (THIS METHOD DOES NOT PRINT)
    public String coordinatePair(int x, int y) {
        return ("(" + x + ", " + y + ")");
        /* implement me!*/
    }

    // method that determines and returns the result of |num1 - num2|
    // (THIS METHOD DOES NOT PRINT)
    public int absoluteValue(int num1, int num2) {
        return Math.abs((num1 - num2));
    }

    // method that constructs and returns a String in the format:
    // "This calculator is a model ____" where ____ should be filled in
    // with the value stored in the calcModel instance variable
    // (THIS METHOD DOES NOT PRINT)
    public String info() {;
        return ("This calculator is a model " + calcModel);
    }
}
