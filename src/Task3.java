import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public List<Integer> findUnique(List<Integer> numbers){
                    Set<Integer> uniqueNumbers = new HashSet<>(numbers);
                    return new ArrayList<>(uniqueNumbers);
    }
}
