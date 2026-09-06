package helloworld.variables;

public class DemoVariables6 {
    public static void main(String[] args) {

        int firstNumber = 50;
        int secondNumber = 8;
        int sum, difference, product, quotient, modulus;

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        product = firstNumber * secondNumber;
        quotient = firstNumber / secondNumber;
        modulus = firstNumber % secondNumber;

        System.out.println("The first number is " + firstNumber);
        System.out.println("The second number is " + secondNumber);

        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + difference);
        System.out.println("Product is " + product);
        System.out.println("Quotient is " + quotient);
        System.out.println("Modulus is " + modulus);
    }
}
