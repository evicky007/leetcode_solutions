int removeDuplicates(int* nums, int numsSize) {
  
  int i,l=1;
  
  for(i=1;i<numsSize;i++)
  {
    if(nums[i]!=nums[l-1])
    {
        nums[l++]=nums[i];
        
    }
   
  }
   
 return l;


}