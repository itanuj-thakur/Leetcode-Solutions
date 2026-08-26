import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int corrIndx = arr[i] - 1;
            if (arr[i] != arr[corrIndx]) {
                int temp = arr[i];
                arr[i] = arr[corrIndx];
                arr[corrIndx] = temp;
            }
            else i++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1) result.add(arr[j]);
        }
        return result;
    }
}
