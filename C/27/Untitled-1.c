#include <stdio.h>

int main(){
    int a[]={0},i;
    printf("The num is %d\n",removeElement(a,sizeof(a)/sizeof(int),0));
    for ( i = 0; i < sizeof(a)/sizeof(int); i++)
    {
        printf("%d ",a[i]);
    }
    
    return 0;
}

int removeElement(int* nums, int numsSize, int val){
    int i,count=0;
    for( i=0 ; i < numsSize; i++){
        if(nums[i]==val) continue;
        else{
            nums[count] = nums[i];
            count++;
        }
    }
    return count;
}