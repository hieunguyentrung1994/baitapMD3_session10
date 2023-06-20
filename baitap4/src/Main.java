import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String rekkei = "Rekkei Academy để nông dân biết code";
        String[] words = rekkei.split(" ");
        System.out.println("chuỗi ban đâu:" + rekkei.toString());
        System.out.println("đổi chuỗi sang mảng:");
        System.out.println(Arrays.toString( words));
        System.out.println("Các phần tử có nhiều hơn 3 ký tự:");
        for(String word: words){
            if(word.length()  >3){
                System.out.println(word);
            }
        }

    }
}