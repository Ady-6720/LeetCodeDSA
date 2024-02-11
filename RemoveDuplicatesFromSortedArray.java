//We are maintaining a pointer which will be at the 1st place of the nums array and will get updated as it finds next unique element

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int index=1; //index set to 1 as we will keep the first element intact
        for(int i=0; i<nums.length-1;i++){
          //the conditional statement will go through the array and will compare the ith elenment with the i+1 element and will put that at the index if its different
            if(nums[i+1]!=nums[i]){
                nums[index]=nums[i+1];
                index++;
            }
        }
        return index;
    }
}
