import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        
       int size = nums.length;
       int[] arr=new int[size];
       Arrays.fill(arr, 0);
        for(int i=0;i<size;i++)
        {
            arr[nums[i]]++;
            if(arr[nums[i]]==2)
                return nums[i];
        }
        return -1;
      
        
    }
}
