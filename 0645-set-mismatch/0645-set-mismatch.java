class Solution {
    public int[] findErrorNums(int[] nums) {
        int correct = 0, x = 0, temp = 0;
        while(x < nums.length)
        {
            correct = nums[x] - 1;
            if(nums[x] != nums[correct])
            {
                temp = nums[correct];
                nums[correct] = nums[x];
                nums[x] = temp;
            }
            else
            x++;
        }
        int[] arr = new int[2];
    for(x = 0; x < nums.length; x++)
    {
        if(nums[x] != (x + 1))
        {
            arr[0] = nums[x];
            arr[1] = x + 1;
        }
    }
    return arr;
}
}
