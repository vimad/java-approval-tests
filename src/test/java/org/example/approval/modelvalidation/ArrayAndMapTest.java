package org.example.approval.modelvalidation;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ArrayAndMapTest {

    @Test
    void testArray() {
        String[] strings = {"val 1", "val 2", "val 3"};
        Approvals.verify(Arrays.stream(strings).toList());
    }

    @Test
    void testMap() {
        Approvals.verify(Map.of("one", 1, "two", 2));
    }
}
