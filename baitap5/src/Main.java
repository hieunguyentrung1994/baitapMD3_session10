import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String words ="tìm số chuỗi ngắn nhất trong đoạn văn bản";
        List<String> word = new ArrayList<>();
        word = Arrays.asList(words.split(" "));
        System.out.println(words);
        System.out.println("\u001B[32m" +word);
        String str = word.get(0);
        for (int i = 0; i < word.size()-1; i++) {
            if(word.get(i).length() < str.length()) {
                str = word.get(i);
            } 
        }
        System.out.println(str.toString());




    }
}