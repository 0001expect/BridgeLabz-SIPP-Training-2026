class Solution {
    public int findPeakElement(int[] nums) {
        int l = nums.length;
        if(l==1){
            return 0;
        }

        if(nums[0]>nums[1]){
            return 0;
        }


        int p=l-1;
        for(int i=1;i<p;i++){
            if(nums[i]>nums[i+1] && nums[i]>nums[i-1]){
                return i;
            }
        }
        if(nums[p]>nums[p-1]){
            return p;
        }
        return -1;
        
    }
}