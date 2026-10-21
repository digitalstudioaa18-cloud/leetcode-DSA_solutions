class Solution {
    public int[] sortedSquares(int[] nums) {
        int x, y, arr[] = new int[nums.length], temp = 0;
        for(x = 0; x < nums.length; x++)
        {
            arr[x] = nums[x] * nums[x];
        }
        for(x = 0; x < arr.length; x++)
        {
            for(y = 0; y < arr.length - 1 - x; y++)
            {
                if(arr[y] > arr[y + 1])
                {
                    temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
        return arr;
    }
}