package datastructure;

import com.sun.tools.javac.util.Pair;
import datastructure.hashing.problems.HashProblems;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aysen on 10/25/16.
 */
public class HashingTest {
    @Test
    public void testFindPairForSum() {
        int[] arr = {10, 15, 24, 45, 33, 0};
        Assert.assertEquals(HashProblems.findPairForSum(arr, 60).get(), Pair.of(45, 15));
    }
}