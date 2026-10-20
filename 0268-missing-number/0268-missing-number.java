class Solution {
    public int missingNumber(int[] nums) {
        int temp, x = 0, correct = 0;
        while(x < nums.length)
        {
            correct = nums[x];
            if(nums[x] < nums.length && nums[x] != nums[correct])
            {
                temp = nums[correct];
                nums[correct] = nums[x];
                nums[x] = temp;
            }
            else
            x++;
        }
        x = 0;
        while(x < nums.length)
        {
            if(nums[x] != x)
            return x;
            x++;
        }
        return x;
    }
}

