class Solution {
    public double minimumAverage(int[] nums) {
        // int min=nums[0];
        // int max = nums[0];
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]<min)
        //     min=nums[i];
        //     if(nums[i]>max)
        //     max=nums[i];
        // }
        // double []avg = new int[]
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        double minavg =nums[nums.length-1];
        while(l<r)
        {
            double curravg = (nums[l]+nums[r])/2.0;
            if(curravg<minavg)
            minavg=curravg;
            l++;
            r--;
            
        }
        return minavg;
    }
}