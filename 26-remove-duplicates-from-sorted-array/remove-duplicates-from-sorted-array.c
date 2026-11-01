int removeDuplicates(int* nums, int numsSize) {
  
  int i,l=0;
  nums[l++]=nums[0];
  for(i=1;i<numsSize;i++)
  {
    if(nums[i]!=nums[i-1])
    {
        nums[l++]=nums[i];
        
    }
   
  }
   
 return l;


}