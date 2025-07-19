class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int ind=0;
      for(int j=0;j<n;j++)
      {
        if(nums[j]!=0)
        {
            nums[ind]=nums[j];
            ind++;
        }
      }
      while(ind<n){
        nums[ind++]=0;
      }  
  
        
    }
}