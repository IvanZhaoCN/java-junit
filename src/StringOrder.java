import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOrder {

//    Given a string, returns a string ordered by the length of the words from shortest to longest.
//    If words have same amount of letters, order them alphabetically.
//            Input -> Output
//        "Hello Java World" ➞ "Java Hello World"
//        "You have a nice day on Saturday!" ➞ "a on day You have nice Saturday!"

    void orderString(String input) {
        String[] words = input.split(" ");
        Stream<String> stream = Arrays.stream(words);
        Stream<String> sorted = stream.sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareToIgnoreCase(o2);
                } else {
                    return o1.length() < o2.length() ? -1 : 1;
                }
            }
        });
        sorted.forEach(System.out::println);
//        List<String> list  = sorted.collect(Collectors.toList());
//        for (:
//             ) {
//
//        }
//        return
    }

    String reorderString(String input) {
        String[] words = input.split(" ");
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareToIgnoreCase(o2);
                } else {
                    return o1.length() < o2.length() ? -1 : 1;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringOrder so = new StringOrder();
//        System.out.println("Hello world!");
        System.out.println(so.reorderString("Hello Java World"));
        System.out.println(so.reorderString("You have a nice day on Saturday!"));
    }

}
