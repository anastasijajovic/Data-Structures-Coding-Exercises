package Arrays.Exercise2;

public class ArrayReverser {
    public void reverseArray(int[] numbers){
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }
}
