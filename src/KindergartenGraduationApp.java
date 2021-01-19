import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class KindergartenGraduationApp {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("bobby", "sarah", "bill", "bailey");
        namesList
                .stream()
                .filter(n -> n.startsWith("b"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }


}
