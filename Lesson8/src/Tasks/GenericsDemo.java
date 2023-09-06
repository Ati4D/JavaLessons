package Tasks;

import java.util.*;

import static java.lang.System.out;

public class GenericsDemo {
    public static void main(String[] args) {
        //List
        ArrayList<String> list1 = new ArrayList<>();
        String[] array = {"one", "two", "three"};

        list1.addAll(Arrays.asList(array));

        ArrayList<String> list2 = new ArrayList<>(list1);

        List<String> list3 = Arrays.asList("four", "five");

        list2.addAll(list2.size() / 2, list3);

        Collections.sort(list2, Collections.reverseOrder());

        ListIterator<String> iterator = list2.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }

        out.println("list1: " + list1);
        out.println("list2: " + list2);

        //Set
        HashSet<String> set1 = new HashSet<>();

        set1.add("String1");
        set1.add("String2");

        set1.addAll(list1);
        set1.addAll(list2);

        System.out.println("set1: " + set1);

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.addAll(list2);
        set2.addAll(list3);

        System.out.println("set2: " + set2);


        //Map
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(0, "January");
        map1.put(1, "February");
        map1.put(2, "March");
        map1.put(3, "April");
        map1.put(4, "May");
        map1.put(5, "June");
        map1.put(6, "July");
        map1.put(7, "August");
        map1.put(8, "September");
        map1.put(9, "October");
        map1.put(10, "November");
        map1.put(11, "December");

        System.out.println("First month: " + map1.get(0));
        System.out.println("Last month: " + map1.get(11));

        map1.put(6, "ОТПУСК");
        System.out.println("6th month: " + map1.get(6));

        HashMap<Integer, String> map2 = new HashMap<>();

        map2.putAll(map1);

        printMap(map1);
        printMap(map2);
    }

    public static void printMap(Map<Integer, String> map) {
        out.println("\nMap: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
