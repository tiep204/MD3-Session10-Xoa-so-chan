import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class In {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 4, 6, 7, 4, 3, 6, 3));
        List<Integer> list1 = new ArrayList<>();
        for (Integer num : list) {
            if (num%2!=0){
                list1.add(num);
            }
        }
        System.out.println(list1);
    }
}