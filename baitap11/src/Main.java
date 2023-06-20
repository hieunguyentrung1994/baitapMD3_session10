

import javafx.print.Collation;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1213);
        numbers.add(12);
        numbers.add(123);
        numbers.add(112);
        numbers.add(1321);

        System.out.println("cho chuỗi số nguyên: " + numbers );
        int minNumbers =  Collections.min(numbers);
        System.out.println("Giá trị nhỏ nhất: " + minNumbers );

    }
}