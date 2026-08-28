class Solution {
    public void sortColors(int[] nums) {
        int n,i,j,temp;
        n=nums.length;
        {
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(nums[i]<nums[j])
                    {
                        temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;

                    }
                }
            }
        }
        
    }
}