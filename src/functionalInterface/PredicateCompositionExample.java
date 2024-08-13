package functionalInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class PredicateCompositionExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "Charlie", "Andrew");

        // Predicate to check if a string starts with "A"
        Predicate<String> startsWithA = s -> s.startsWith("A");

        // Predicate to check if a string has length greater than 3
        Predicate<String> lengthGreaterThanThree = s -> s.length() > 3;

        // Composing predicates using and()
        Predicate<String> startsWithAAndLengthGreaterThanThree = startsWithA.and(lengthGreaterThanThree);

        // Filtering the list using the composed predicate
        List<String> filteredNames = names.stream()
                .filter(startsWithAAndLengthGreaterThanThree)
                .collect(Collectors.toList());

        // Print the filtered list
        System.out.println("Names starting with 'A' and length greater than 3: " + filteredNames);
    }
}
