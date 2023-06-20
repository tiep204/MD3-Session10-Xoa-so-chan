import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 4, 4, 7, 5, 3, 2, 6, 8));
        List<Integer> integerList = new ArrayList<>();
        for (int i : list) {
            if (i % 2 != 0) {
                integerList.add(i);
            }
        }
        System.out.println(integerList);
    }
}