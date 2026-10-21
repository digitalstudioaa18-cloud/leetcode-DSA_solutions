class Solution {
    public void sortColors(int[] nums) {
        for(int x = 0; x < nums.length; x++)
        {
            for(int y = 0; y < nums.length - 1 - x; y++)
            {
                if(nums[y] > nums[y + 1])
                {
                    int temp = nums[y];
                    nums[y] = nums[y + 1];
                    nums[y + 1] = temp;
                }
            }
        }
    }
}