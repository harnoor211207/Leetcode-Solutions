class Solution {
    public int majorityElement(int[] nums) {
        int count=0,a=0;
        for (int x : nums) {
            if (count == 0) {
                a = x;
            }
            if (x == a) {
                count = count + 1;
            } else {
                count = count - 1;
            }
        }
        return a;
    }
}
