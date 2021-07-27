#include<stdio.h>

int main(){
    int a[]={1,3,5,6};
    printf("%d",searchInsert(a,sizeof(a)/4,5));
}

int searchInsert(int* nums, int numsSize, int target){
    int i,flag=0,j,t,result;
    for ( i = 0; i < numsSize; i++)
    {
        if (nums[0]>target)
            result = 0;
        else if (nums[numsSize-1]<target)
            result = numsSize;
        else if (nums[i]<target && nums[i+1]>=target)
            result = i + 1;
        else if (nums[i]<target && nums[i+1]<target)
            continue;
    }
    
    return result;
    
}