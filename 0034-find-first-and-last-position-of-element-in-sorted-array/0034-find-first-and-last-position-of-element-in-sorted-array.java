class Solution {
    public int[] searchRange(int[] nums, int target) {
      int lo=0;
      int hi=nums.length-1;
      int ans[] = {-1,-1};
      while(lo<=hi){
        int mid = (lo+hi)/2;
        if(nums[mid]==target){
        ans[0]=mid;
        hi=mid-1;
        }
        else if(nums[mid]>target)
        hi=mid-1;
        else
        lo=mid+1;
      }  
      int l=0,h=nums.length-1;
      while(l<=h){
        int midd=(l+h)/2;
        if(nums[midd]==target){
            ans[1]=midd;
            l=midd+1;
        }
        else if(nums[midd]>target)
        h=midd-1;
        else
        l=midd+1;
      }
      return ans;
    }
}