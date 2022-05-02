import java.util.*;

public class Test {
    /** Main method */
    public static void main(String[] args) {

        Integer[] intArray = { new Integer(2), new Integer(4),
                new Integer(3) };
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

        Double[] doubleArray = { new Double(3.4), new Double(1.3),
                new Double(-22.1) };
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(doubleArray));

        Character[] charArray = { new Character('a'),
                new Character('J'), new Character('r') };
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(charArray));

        String[] stringArray = { "Tom", "Susan", "Kim" };
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(stringArray));

        System.out.println("Maximum Integer object: " +
                Exercise_19_10.max(intList));
        System.out.println("Maximum Double object: " +
                Exercise_19_10.max(doubleList));
        System.out.println("Maximum Character object: " +
                Exercise_19_10.max(charList));
        System.out.println("Maximum String object: " +
                Exercise_19_10.max(stringList));
    }
}