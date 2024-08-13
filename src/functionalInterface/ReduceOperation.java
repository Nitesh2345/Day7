package functionalInterface;

import java.util.Arrays;
import java.util.List;
public class ReduceOperation {

    public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Use Stream API to find the sum of all even numbers
            int sumOfEvenNumbers = numbers.stream()
                    .filter(n -> n % 2 == 0) // Filter even numbers
                    .mapToInt(Integer::intValue) // Map to int
                    .reduce(0, Integer::sum); // Reduce to sum

            // Print the sum of even numbers
            System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
        }
}
