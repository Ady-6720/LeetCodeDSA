// We are first checking if the aray given is empty or not, after that we are creating a new variable J which is 0
// Putting for loop for nums[i] till nums.length, and putting if the value doesnt matches the value at i it will get stored at the which is the 0 at first
//j will increment and will store next nums[i] when its not equal to val
//we are just modifying the array without creting a new array such that the values at the end will be garbage or anythhing
//we are returning the value of J which is the new updates size of array without the unnecessary elements and garbaga
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int j=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!= val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
