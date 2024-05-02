package org.yfanz.demo;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class ArrayHelper {
    private static String[] arr1 = {"tom", "jerry", "lucy", "kate", "jerry"};
    private static List<String> list1 = new ArrayList<>();

//    public ArrayHelper() {
//        list1 = List.of(arr1);
//    }

    static String[] removeDuplicateItem(String[] args){
        System.out.println("for array");
        Stream<String> stream = Arrays.stream(args);
        return stream.distinct().toArray(String[]::new);
    }

    static List<String> removeDuplicateItem(List<String> args){
        System.out.println("for list");
        Stream<String> stream = args.stream();
        return stream.distinct().toList();
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(removeDuplicateItem(arr1)));
        //list1 = List.of(arr1);
//        System.out.println(removeDuplicateItem(list1));

        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(Arrays.toString(arr1));

//        list1 = Arrays.asList(arr1);
//        System.out.println(list1);
//        Collections.sort(list1);
//        System.out.println(list1);
    }
}
