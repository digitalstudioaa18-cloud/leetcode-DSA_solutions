class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int s = 0, e = nums.length - 1, x = 0, arr[] = new int[nums.length];
        while(x < nums.length)
        {
            if(nums[x] % 2 == 0)
            {
                arr[s] = nums[x];
                s++;
            }
            else
            {
                arr[e] = nums[x];
                e--;
            }
            x++;
        }
        return arr;
    }
}