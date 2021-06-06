
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodingTaskTests {


    @Test
    public void longestSubstringWithoutRepeatingTest(){

        int result1 =  CodingTasks.longestSubstringWithoutRepeating("abcabcbb");
        assertEquals(result1,3);

        int result2 =  CodingTasks.longestSubstringWithoutRepeating("bbbbb");
        assertEquals(result2,1);

        int result3 =  CodingTasks.longestSubstringWithoutRepeating("pwwkew");
        assertEquals(result3,3);

        int result4 =  CodingTasks.longestSubstringWithoutRepeating("topptgb");
        assertEquals(result4,4);
    }

    @Test
    public void findSubArrayWithGivenSumTest(){

        boolean result1 = CodingTasks.findSubArrayWithGivenSum(new int[]{1,2,3,4},7);
        assertEquals(result1 , true);

        boolean result2 = CodingTasks.findSubArrayWithGivenSum(new int[]{1,1,1,5,1,1,1,6,1,2,2},4);
        assertEquals(result2 , true);

        boolean result3 = CodingTasks.findSubArrayWithGivenSum(new int[]{1,6,3,4,3,3},10);
        assertEquals(result3 , true);

        boolean result4 = CodingTasks.findSubArrayWithGivenSum(new int[]{1,4,5},11);
        assertEquals(result4 , false);


    }



}
