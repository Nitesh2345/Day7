package functionalInterface;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {

        public static void main(String[] args) {
            List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

            // Use Stream API and lambda expression to filter strings starting with "A"
            List<String> filteredStrings = strings.stream()
                    .filter(s -> !s.startsWith("A"))
                    .collect(Collectors.toList());

            // Print the filtered list
            System.out.println("Filtered strings: " + filteredStrings);
        }
}


