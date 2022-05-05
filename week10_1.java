import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Task_tena {
    public static void main(String[] args) throws Exception {
        File textFile = new File("task_eight.txt");
        if (!textFile.exists()) {
            System.out.println("The file " + textFile + " does not exist.");
            System.exit(0);
        }
        List<String> list = new ArrayList<>();
        try (Scanner input = new Scanner(textFile)) {
            while (input.hasNext()) {
                String[] array = input.nextLine().split(" ");
                for (int i = 0; i < array.length; i++) {
                    if (array[i].length() > 0 && Character.isLetter(array[i].charAt(0))) {
                        list.add(array[i]);
                    }
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
