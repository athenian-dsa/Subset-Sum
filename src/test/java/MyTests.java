import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {

    // --------------------------
    // Test 1: Basic Subset Sum
    // --------------------------
    @Test
    public void testBasicSubsetSum() {
        int[] arr1 = {1, 1, 3, 7};

        // Does {1, 1, 3, 7} have a subset sum of 5?
        assertTrue(SubsetSum.subsetSum(arr1, 5));

        // Does {1, 1, 3, 7} have a subset sum of 11?
        assertTrue(SubsetSum.subsetSum(arr1, 11));

        // Does {1, 1, 3, 7} have a subset sum of 12?
        assertTrue(SubsetSum.subsetSum(arr1, 12));

        // Does {1, 1, 3, 7} have a subset sum of 6?
        assertFalse(SubsetSum.subsetSum(arr1, 6));
    }

    // --------------------------
    // Test 2: More Subset Sum
    // --------------------------
    @Test
    public void testMoreSubsetSum() {
        int[] arr2 = {1, 1, 5, 6, 8, 10, 12, 14, 16};

        // Does {1, 1, 5, 6, 8, 10, 12, 14, 16} have a subset sum of 11?
        assertTrue(SubsetSum.subsetSum(arr2, 11));

        // Does {1, 1, 5, 6, 8, 10, 12, 14, 16} have a subset sum of 28?
        assertTrue(SubsetSum.subsetSum(arr2, 28));

        // Does {1, 1, 5, 6, 8, 10, 12, 14, 16} have a subset sum of 32?
        assertTrue(SubsetSum.subsetSum(arr2, 32));

        // Does {1, 1, 5, 6, 8, 10, 12, 14, 16} have a subset sum of 73?
        assertTrue(SubsetSum.subsetSum(arr2, 73));
    }

    // --------------------------
    // Test 3: Basic Knapsack
    // --------------------------
    @Test
    public void testBasicKnapsack() {
        // Test case 1
        int[] weights1 = {5, 10, 25};
        int[] values1 = {70, 90, 140};
        assertEquals(160, SubsetSum.knapsack(weights1, values1, 25));

        // Test case 2
        int[] weights2 = {5, 10, 20};
        int[] values2 = {150, 60, 140};
        assertEquals(290, SubsetSum.knapsack(weights2, values2, 30));

        // Test case 3
        int[] weights3 = {5, 20, 10};
        int[] values3 = {50, 140, 60};
        assertEquals(200, SubsetSum.knapsack(weights3, values3, 30));
    }

    // --------------------------
    // Test 4: Advanced Knapsack
    // --------------------------
    @Test
    public void testAdvancedKnapsack() {
        int[] weights4 = {85, 26, 48, 21, 22, 95, 43, 45, 55, 52};
        int[] values4 = {79, 32, 47, 18, 26, 85, 33, 40, 45, 59};
        assertEquals(117, SubsetSum.knapsack(weights4, values4, 101));
    }
}