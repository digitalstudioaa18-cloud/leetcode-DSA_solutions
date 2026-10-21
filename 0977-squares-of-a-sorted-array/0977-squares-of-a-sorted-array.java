class Solution {
    public int[] sortedSquares(int[] nums) {
        int x, s = 0, e = nums.length - 1, arr[] = new int[nums.length];
        for(x = 0; x < nums.length; x++)
        {
            nums[x] = nums[x] * nums[x];
        }
        x = nums.length - 1;
        while(s <= e)
        {
            if(nums[e] > nums[s])
            {
                arr[x] = nums[e];
                e--;
            }
            else
            {
                arr[x] = nums[s];
                s++;
            }
            x--;
        }
        return arr;
    }
}