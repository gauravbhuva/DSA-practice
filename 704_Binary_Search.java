class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length -1;
        int low = 0;
        while(low<=high){
            int l =(high+low)/2 ;
            if(target>nums[l]){
                low = (l+1);
            }
            else if(target<nums[l]){
                high = (l-1);
            }
            else if(target == nums[l]){
                return l;
            }
        }
        return -1;
    }
}
