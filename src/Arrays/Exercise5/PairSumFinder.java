package Arrays.Exercise5;

import java.util.Arrays;

public class PairSumFinder {
    public void findPairsWithSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int left = 0;
        int right = numbers.length - 1;
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                System.out.println("(" + numbers[left] + ", " + numbers[right] + ")");
                left++;
                right--;
            }
            else if(sum < target) {
                left++;
            }else {
                right--;
            }
        }
    }
}
