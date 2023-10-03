import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter calculator model: ");
        String model = scan.nextLine();

        // create Calculator object
        Calculator calc = new Calculator(model);

        // initialize a variable to capture main menu option choice from user
        int userOption = 0;

        // loop until user choose option 6
        while (userOption != 6) {
            System.out.println("Main menu:");
            System.out.println("1. perform + - * or / operation");
            System.out.println("2. check divisibility");
            System.out.println("3. coordinate pair");
            System.out.println("4. absolute value");
            System.out.println("5. info about this calculator");
            System.out.println("6. QUIT");
            // ADD LOGIC HERE TO GET INPUT FROM USER,
            // THEN CALL APPROPRIATE METHODS ON YOUR CALCULATOR OBJECT
            // BASED ON WHICH OPTION WAS SELECTED
            // repeat as long as user does not select option 6 from the main menu
            System.out.print("Enter option: ");
            userOption = scan.nextInt();
            scan.nextLine();
            if (userOption == 1) {
                System.out.print("Enter first integer: ");
                int num11 = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter second integer: ");
                int num12 = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter operation symbol (+ - * /): ");
                String symbol = scan.nextLine();
                System.out.println(num11 + " " + symbol + " " + num12 + " = " +
                        calc.performOperation(symbol, num11, num12));
                System.out.println("");
            }
            if (userOption == 2) {
                System.out.print("Enter first integer: ");
                int num21 = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter second integer: ");
                int num22 = scan.nextInt();
                scan.nextLine();
                if (calc.divisibleBy(num21, num22)) {
                    System.out.println(num21 + " is divisible by " + num22);
                }
                else {
                    System.out.println(num21 + " is NOT divisible by " + num22);
                }
                System.out.println("");
            }
            if (userOption == 3) {
                System.out.print("Enter first integer: ");
                int num31 = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter second integer: ");
                int num32 = scan.nextInt();
                System.out.println(calc.coordinatePair(num31, num32));
                System.out.println("");
            }
            if (userOption == 4) {
                System.out.print("Enter first integer: ");
                int num41 = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter second integer: ");
                int num42 = scan.nextInt();
                scan.nextLine();
                int abv = calc.absoluteValue(num41, num42);
                System.out.println("|" + (num41) + " - " + (num42) + "| = "
                        + abv );
                System.out.println("");
            }
            if (userOption == 5) {
                String msg = calc.info();
                System.out.println(msg);
                System.out.println("");
            }
        }
        System.out.println("Goodbye!");
    }
}