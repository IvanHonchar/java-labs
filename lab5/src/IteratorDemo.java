import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "apple",
                "cherry",
                "banana",
                "melon",
                "orange"
        );

        Iterator<String> iterator = ListFilteringIteratorCreator.createFilteringIterator(
                list,
                str -> !str.contains("a") // omit strings with character 'a'
        );

        iterator.forEachRemaining(System.out::println);
    }
}
