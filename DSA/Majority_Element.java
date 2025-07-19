class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length;
       int count=1;
       int ele=nums[0];
       for(int i=1;i<n;i++)
       {
          if(nums[i]!=ele)
          {
            count--;
          }
          else if(nums[i]==ele)
          {
            count++;
          }
          if(count==0)
          {
            ele=nums[i];
            count=1;
          }
       }
       return ele;
    }
}