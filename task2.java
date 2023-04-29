
/*
 * ѕусть дан произвольный список целых чисел, удалить из него чЄтные числа
 */
import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("Arrey: ");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.print("New arrey: ");
        System.out.println(list);
    }
}