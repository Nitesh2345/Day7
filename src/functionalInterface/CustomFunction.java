package functionalInterface;

public class CustomFunction {

        public static void main(String[] args) {
            // Implement the SumFunction interface using a lambda expression
            SumFunction sumFunction = (a, b) -> a + b;

            // Test the lambda expression
            int result = sumFunction.sum(5, 10);
            System.out.println("The sum is: " + result);
        }

}
