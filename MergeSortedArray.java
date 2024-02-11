 /* We are amintaining 3 pointers 
 p will be at the last index of nums1
 p1 will be the the given m-1
 p2 will be at the given n-1

 we will use comparison by if else 
 
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int  p=m+n-1;
        int p1=m-1;
        int p2=n-1;

    //here if the condition is true which is if value at p1>p2 then the index at p will be get value at nums1[p1] and will deeccrement only p and p1
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[p]=nums1[p1];
                p--;
                p1--;
            }
    //same logic but now for opposite case 
            else{
                nums1[p]=nums2[p2];
                p--;
                p2--;
            }
        }
      // if there are still elements are rremaining in nums2 so this loop will ensure that the elements gets placed at the vacant num1 places
        while(p2>=0){
           nums1[p]=nums2[p2];
                p--;
                p2--; 
        }
    }
}
