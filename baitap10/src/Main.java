import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        System.out.println("dãy mảng số nguyên" + numbers);
        int sum = 0;
        for (Integer i : numbers) {
            sum += i;
        }
        System.out.println("tổng : " + sum);


    }
}