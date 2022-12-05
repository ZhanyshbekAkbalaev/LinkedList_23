package linkedList;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String > arrayList = new ArrayList<>();
//        arrayList.add("java");
//        arrayList.add("js");
//
//       /// System.out.println(arrayList);
//
//
        LinkedList<Student > students = new LinkedList<>();
        students.add(new Student("Aigerim" ,"Bektermirova",18));
        students.add(new Student("ilim" ,"Shabdanov",18));
        students.add(new Student("Baitik" ,"Taalaibekov",19));
        students.add(new Student("Erbol" ,"Ashirali uulu",20));
        students.add(new Student("Zhanyshbek" ,"Akbalaev",18));

//        SurnamaComparator surnamaComparator = new SurnamaComparator();
//        students.sort(surnamaComparator);
        Collections.sort(students,Student.sortByName);

        //Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }


//
//
////        linkedList.addFirst("java");
////        linkedList.addLast("dasdf");
////        linkedList.removeFirst();//birinchi ssylkany ochurot
////        System.out.println(linkedList.pollFirst());
//        System.out.println(linkedList);
//  //      System.out.println(linkedList.get(2));
//        for (String s : linkedList) {
//            System.out.println(s);
//
//        }
//        System.out.println("+++");
//        Iterator<String > iterator = linkedList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        LinkedList<Integer> integers = new LinkedList<>(Arrays.asList(
//                1,2,3,4,5,6,6
//        ));
//        List<Integer> numbers = List.of(1,2,3,4,4,5,6,67,7,8);
//        Collections.sort(numbers);
//        System.out.println(numbers);
    }
}
