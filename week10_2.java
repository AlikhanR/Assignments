import java.util.Iterator;
import java.util.LinkedList;
public class Task_tenb {
    public static void main(String[] args) {
        long start, end;
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 5000000; i++) linkedList.add(i);
        Iterator<Integer> iterator = linkedList.iterator();
        start = System.currentTimeMillis();
        while (iterator.hasNext()) iterator.next();
        end = System.currentTimeMillis();
        System.out.println("Iterator: " + (end - start));
        start = System.currentTimeMillis();
        for(int i = 0; i < linkedList.size(); i++) linkedList.get(i);
        end = System.currentTimeMillis();
        System.out.println("Get method: " + (end - start));
    }
}
