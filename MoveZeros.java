//solution 1
class Solution {
    public void moveZeroes(int[] nums) {
        int R=1;
        int L=0;
        while(R<nums.length){
            if(nums[L]!=0){
                R++;
                L++;
            }
            else if(nums[R]==0){
                R++;
            }
            else{
                int Temp=nums[R];
                nums[R]=nums[L];
                nums[L]=Temp;
            }
        }
    }
}

//solution2 
class Solution {
    public void moveZeroes(int[] nums) {
        int insert=0;
        for(int i=0;i< nums.length; i++){
            if(nums[i]!=0){
                nums[insert]=nums[i];
                insert++;
            }
        }
        while(insert<nums.length){
            nums[insert++]=0;
        }
    }
}
