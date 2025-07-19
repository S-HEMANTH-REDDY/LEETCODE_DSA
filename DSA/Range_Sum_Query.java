
class NumArray {

        int sum[];
        public NumArray(int[] nums) {
            int len=nums.length;
            sum=new int[len];
            sum[0]=nums[0];
            for(int i=1;i<len;i++)
            {
                sum[i]=sum[i-1]+nums[i];
            }
            
        }
        
        public int sumRange(int left, int right) {
            if(left>0)
            {
                return sum[right]-sum[left-1];
            }
            return sum[right];
        }
    }
    