class Solution {
    public int[] searchRange(int[] nums, int t) {
        int k;
        int[] arr={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t){
                arr[0]=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==t){
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
}