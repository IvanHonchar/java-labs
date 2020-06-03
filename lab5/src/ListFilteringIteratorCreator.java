import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class ListFilteringIteratorCreator {

    /**
     * @param list list to iterate over
     * @param filter predicate which determines filtering rule
     */
    public static <T> Iterator<T> createFilteringIterator(List<T> list, Predicate<T> filter) {
        return list.stream()
                .filter(filter)
                .iterator();
    }
}
