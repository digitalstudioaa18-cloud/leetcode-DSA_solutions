class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x, arr[] = new int[m + n], y = 0, temp = 0;
        for(x = 0; x < m; x++)
        {
            arr[x] = nums1[x];
        }
        for(x = 0; x < n; x++)
        {
            arr[x + m] = nums2[x];
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
        for(x = 0; x < arr.length; x++)
        {
            nums1[x] = arr[x];
        }
    }
}