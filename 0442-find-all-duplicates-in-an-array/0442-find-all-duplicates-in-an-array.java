class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int correct = 0, x = 0, temp = 0;
        ArrayList<Integer> list = new ArrayList<>();
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
    for(x = 0; x < nums.length; x++)
    {
        if(nums[x] != (x + 1))
        list.add(nums[x]);
    }
    return list;
}
}