//used two pointer method with narrowing window method
//also made new array and did copied elements by compairing from last position to the first position

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result= new int[nums.length];
        for(int i=0; i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        int  right=nums.length-1;
        int left=0;
        for(int pos=nums.length-1; pos>=0;pos--){
            if(nums[left]<nums[right]){
                    result[pos]=nums[right];
                    right--;
            }
            else{
                result[pos]=nums[left];
                left++;
            }
        }
        return result;
    }
}
