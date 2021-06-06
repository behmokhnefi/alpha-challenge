public class CodingTasks {

    public static int longestSubstringWithoutRepeating(String input) {
        int n = input.length(), result = 0;
        int[] lastIndex = new int[256];

        for (int i = 0; i < lastIndex.length; i++) {
            lastIndex[i] = -1;
        }

        int start = 0;

        for (int end = 0; end < n; end++) {

            if (start < lastIndex[input.charAt(end)] + 1)
                start = lastIndex[input.charAt(end)] + 1;

            result = Math.max(result, end - start + 1);

            lastIndex[input.charAt(end)] = end;
        }
        return result;
    }


    public static boolean findSubArrayWithGivenSum(int [] inputArr, int targetSum){
        int sum = inputArr[0] , startIndex = 0;
        for(int i = 1; i<=inputArr.length; i++){

            while (startIndex<i && sum>targetSum){
                sum = sum - inputArr[startIndex];
                startIndex++;
            }

            if(sum == targetSum)
                return true;

            if(sum < targetSum){
                if(i==inputArr.length)
                    return false;
                sum += inputArr[i];
            }
        }
        return false;
    }

}
