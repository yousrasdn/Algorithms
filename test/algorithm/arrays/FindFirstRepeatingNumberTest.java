package algorithm.arrays;

import algorithm.arrays.fetching.FindFirstRepeatingNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindFirstRepeatingNumberTest {

    @Test
    void findFirstRepeatingNumber_duplicateIsFound() {
        int[] numbers = {1, 5, 7, 3, 4, 3, 1, 2};

        int response = FindFirstRepeatingNumber.findFirstRepeatingNumber(numbers);

        assertEquals(3, response);
    }

    @Test
    void findFirstRepeatingNumber_duplicateIsNotFound() {
        int[] numbers = {1, 5, 7, 6, 4, 3, 0, 2};

        int response = FindFirstRepeatingNumber.findFirstRepeatingNumber(numbers);

        assertEquals(-1, response);
    }
}
