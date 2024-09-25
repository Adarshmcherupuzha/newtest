public class sum {

    // Method to calculate the sum of two integers
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        sum sumCalculator = new sum();

        int num1 = 5;
        int num2 = 10;

        // Calculate the sum
        int result = sumCalculator.add(num1, num2);

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        System.out.println("Thanks!!!");
    }
}
