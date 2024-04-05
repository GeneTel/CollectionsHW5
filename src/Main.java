import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // #1
        Task1 obj = new Task1();

        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("apple");
        words.add("lemon");
        words.add("apple");
        words.add("mango");
        words.add("tomato");
        words.add("potato");
        words.add("apple");

        String target = "apple";
        int occurrences = obj.countOccurrence(words, target);
        System.out.println("The word \"" + target + "\" occurs " + occurrences + " times.");

        // #2
        Task2 toListObj = new Task2();
        int[] array = {1, 2, 3, 4, 5};

        //This line converts the array into a List using the toList method
        List<Integer> resultList = toListObj.toList(array);

        System.out.println("Resulting List:");
        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i) + " ");
        }
        //#3
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(10);
        numbers.add(25);
        numbers.add(15);
        numbers.add(25);
        numbers.add(9);
        numbers.add(10);
        numbers.add(7);

        List<Integer> uniqueNumbers = new Task3().findUnique(numbers);

        System.out.println("Unique numbers:");
        for (int i = 0; i < uniqueNumbers.size(); i++){
            int num = uniqueNumbers.get(i);
            System.out.println(num);
        }
        //#4
        Task4 occur = new Task4();

        List<String> cars = new ArrayList<>();
        cars.add("audi");
        cars.add("bmw");
        cars.add("mazda");
        cars.add("toyota");
        cars.add("lexus");
        cars.add("tesla");

        occur.calcOccurance(cars);
    }
    }

