/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=findPeak(mountainArr);
        int s=0,e=peak;
        //ASCENDING CHECK FIRST TO FIND MIN INDEX 
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)==target) return mid;
            if(mountainArr.get(mid)<target) s=mid+1;
            else e=mid-1;
        }
        //DESCENDING CHECK AT LAST IF THE ELEMENT IS ON RIGHT ARR OR NOT
        s=peak+1;e=mountainArr.length()-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)==target) return mid;
            if(mountainArr.get(mid)>target) s=mid+1;
            else e=mid-1;
        }
        return -1;
    }
    static int findPeak(MountainArray mountainArr){
        int s=0,e=mountainArr.length()-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)) s=mid+1;
            else e=mid;
        }
        return s;
    }
}
