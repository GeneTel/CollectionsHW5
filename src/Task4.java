import java.util.*;

public class Task4 {
    public void calcOccurance(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        Set<Map.Entry<String, Integer>> entries = wordCount.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        for (int i = 0; i < entries.size(); i++) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    }


