/*
 * «адан целочисленный список ArrayList. Ќайти минимальное, максимальное и среднее из этого списка.
 */
import java.util.ArrayList;
import java.util.Collections;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(8);
        numbers.add(3);
        numbers.add(45);
        numbers.add(32);
        numbers.add(14);
        
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        double avg = calculateAverage(numbers);
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + avg);
    }
    
    public static double calculateAverage(ArrayList<Integer> list) {
        double sum = 0.0;
        for (Integer number : list) {
            sum += number;
        }
        return sum / list.size();
    }
}
