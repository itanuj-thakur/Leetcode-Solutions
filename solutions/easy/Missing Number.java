class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        //first sort till n-1
        while(i<arr.length){
            int correctIndex=arr[i];//as we are also given 0
            if(arr[i]<arr.length && arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else i++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j) return j;
        }
        return arr.length;
    }
}

//BY MATHS
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
