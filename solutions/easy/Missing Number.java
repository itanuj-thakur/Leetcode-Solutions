//With cyclic sort 
class Solution {
    public int missingNumber(int[] arr) {
        //Cyclic sort best as range[0,N]
        int i = 0,length=arr.length;
        while (i < length) {
            int correctIndex = arr[i];
            if (arr[i] < length && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for(int j=0;j<length;j++){
            if(arr[j]!=j) return j;
        }
        return length;
    }
}
//Using Math 
class Solution {
    public int missingNumber(int[] arr) {
        //Math approach total sum =n(n+1)/2
        int len=arr.length;
        int sum=len*(len+1)/2;
        int actualSum=0;
        for(int num : arr)
        actualSum+=num;
        return sum-actualSum;
        
    }
}
//Using XOR PROPERTY
class Solution {
    public int missingNumber(int[] arr) {
        //XOR way : XOR properties:x ^ x = 0 (any number XORed with itself cancels out) x ^ 0= x If you XOR all indices from 0 to n and all numbers in the array, every matching number cancels out, leaving only the missing one. This has zero risk of integer overflow.
        int xor=arr.length;
        for(int i=0;i<arr.length;i++){
            xor=xor^(i^arr[i]);
        }
        return xor;
    }
}
