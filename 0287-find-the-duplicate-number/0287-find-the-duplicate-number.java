class Solution {
    public int findDuplicate(int[] nums) {
        int correct = 0, x = 0, temp = 0;
        while(x < nums.length)
        {
            if(nums[x] != (x + 1)){
            correct = nums[x] - 1;
            if(nums[x] != nums[correct])
            {
                temp = nums[correct];
                nums[correct] = nums[x];
                nums[x] = temp;
            }
            else
            return nums[x];
        }
        else
        x++;
    }
    return -1;
}
}