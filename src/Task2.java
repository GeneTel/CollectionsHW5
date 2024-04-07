import java.util.ArrayList;
import java.util.List;

public class Task2 {
        public List<Integer> toList(int[] array) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                list.add(array[i]);
            }
            return list;
        }
    }

