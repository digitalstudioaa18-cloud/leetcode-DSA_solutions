class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int correct = 0, temp = 0, x = 0;
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
        ArrayList<Integer> list = new ArrayList<>();
        for(x = 0; x < nums.length; x++)
        {
            if(nums[x] != (x + 1))
            list.add(x + 1);
        }
        return list;
    }
}