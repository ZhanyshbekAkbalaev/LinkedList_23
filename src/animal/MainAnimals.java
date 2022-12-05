package animal;

import java.util.*;

public class MainAnimals {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i <= 15; i++) {
            numbers.add(random.nextInt(0, 2));
        }

        for (int i = 0; i <= 15; i++) {
            numbers1.add(random.nextInt(0, 2));
        }
        
        System.out.println("One method Linked List: "+integerList(numbers));
        System.out.println("Two method Array List: "+integerArrayList(numbers1));

    }

    public static List<Integer> integerList(LinkedList<Integer> numbers) {
        Random random = new Random();
        numbers.add(random.nextInt(0, 2));
        Collections.sort(numbers);
        return numbers;
    }

    public static ArrayList<Integer> integerArrayList(ArrayList<Integer> numbers1) {
        Random random = new Random();
        numbers1.add(random.nextInt(0, 2));
        Collections.sort(numbers1);
        return numbers1;
    }
}

