public class week9_1 {

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (key.compareTo(list[i]) == 0)
                return i;
        }
        return -1;
    }
}