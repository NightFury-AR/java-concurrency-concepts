import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello World !!! 😎");
        /*int num[] = {10,15,8,49,25,98,98,15,15,15};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            boolean isExist = map.containsKey(num[i]);
            if(isExist) {
                Integer existingValue = map.get(num[i]);
                map.put(num[i],existingValue+1);
            } else {
                map.put(num[i],1);
            }
        }

        map.entrySet()
                .stream()
                .filter(integerIntegerEntry -> integerIntegerEntry.getValue() > 1)
                .forEach(entry -> System.out.println("value = " + entry.getKey()));

        Arrays.stream(num)
                .boxed()
                .collect(Collectors.groupingBy(i -> i))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 1 )
                .forEach(System.out::println);
*/
    }
}
