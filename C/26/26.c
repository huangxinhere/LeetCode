#include <stdio.h>
#include <stdlib.h>

int main(){
    int a[]={1,1,2},num,t;
    t=sizeof(a)/sizeof(int);
    num=removeDuplicates(a,t);
    printf("result=%d\n",num);
    return 0 ;
}

int removeDuplicates(int* nums, int numsSize){
    //leetcode 就是因为缺少这个判断0而不通过，造成可能==42==ERROR: AddressSanitizer: heap-buffer-overflow on address数组越界或堆栈溢出
    if (numsSize == 0) {
        return 0;
    }

    int i=1,tag=nums[0],count=1,temp,t=nums[numsSize-1];
    for ( ; i < numsSize; i++)
    {
        if(tag==nums[i])
            continue;
        else if (tag!=nums[i])
        {
            tag = nums[i];
            temp = nums[i],nums[i] = nums[count],nums[count] = temp;
            count++;
        }

    }

    for(i=0,count=0;i<numsSize;i++,count++)
        if(nums[i]==t)
        {
            count++;
            break;
        }

    return count;

}

