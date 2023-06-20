import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<Integer> numberSole = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(15);
        numbers.add(12);

        System.out.println("mảng ban đầu:" +"\t"+ numbers);
        for(Integer number : numbers){
            if( number%2 != 0){
                numberSole.add(number);
            }
        }
        System.out.println("mảng số lẻ mới:" +"\t"+ numberSole);
    }
}