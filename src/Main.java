import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class a {
    public a(int x) {
        System.out.println("Inside a constructor");
    }
}

class B extends a {
    public B(int x) {
        super(x);
        System.out.println("Inside b constructor");
    }
}
public class Main {
    public static void main(String[] args) {
        List<String> records = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader("/home/shivamverma/Desktop/all_services_starting_with_S.csv"))) {
            String line = br.readLine();
            while(line  != null) {
                System.out.println(line);
                char ch = line.charAt(1);
                int count = map.get(ch) == null ? 0 : map.get(ch);
                map.put(ch, count+1);
                line = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        map.forEach((k, v) -> {
            System.out.println(k + ", " + v);
        });
    }
}