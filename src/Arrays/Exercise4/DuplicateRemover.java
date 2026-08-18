package Arrays.Exercise4;

import java.util.ArrayList;

public class DuplicateRemover {
    public void removeDuplicates(ArrayList<Integer> numbers){
        int index = 0;
        while(index < numbers.size() - 1){
            if (numbers.get(index).equals(numbers.get(index + 1))){
                numbers.remove(index + 1);
            }
            else {
                index++;
            }
        }
    }
}
