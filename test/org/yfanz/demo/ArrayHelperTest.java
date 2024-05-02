package org.yfanz.demo;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayHelperTest {

    @org.junit.jupiter.api.Test
    void removeDuplicateItem() {
        String[] input = {"tom", "jerry", "lucy", "kate", "jerry"};
        String[] expect = {"tom", "jerry", "lucy", "kate"};
        String[] expect2 = {"tom", "jerry", "kate", "lucy"};
        List<String> listInput = new ArrayList<>();
        List<String> listExpect = new ArrayList<>();
        listInput = List.of(input);
        listExpect = List.of(expect);
        assertArrayEquals(expect, ArrayHelper.removeDuplicateItem(input));
//        assertEquals(expect,ArrayHelper.removeDuplicateItem(input));
        assertEquals(listExpect, ArrayHelper.removeDuplicateItem(listInput));
        System.out.println(ArrayHelper.removeDuplicateItem(listInput));
        System.out.println(listExpect);
    }
}