import java.util.List;

public class Task1 {
    public int countOccurrence(List<String> words, String target) {
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word.equals(target)){
                count++;
            }

        }
return count;
    }
}
