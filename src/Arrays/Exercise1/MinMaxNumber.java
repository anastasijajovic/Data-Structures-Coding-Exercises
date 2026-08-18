package Arrays.Exercise1;

public class MinMaxNumber {
    public int[] findMinMax(int[] numbers){
        int max = numbers[0];
        int min = numbers[0];
        for(int num : numbers){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        return new int[]{max, min};
    }
}


