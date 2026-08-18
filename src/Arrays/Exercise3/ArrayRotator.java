package Arrays.Exercise3;

public class ArrayRotator {
    public void rotateRight(int[] numbers, int k){
        int n = numbers.length;
        k = k % n;
        reverse(numbers, 0, n - 1);
        reverse(numbers, 0, k - 1);
        reverse(numbers, k, n - 1);

    }

    public void reverse(int[] numbers, int start, int end){
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
}
