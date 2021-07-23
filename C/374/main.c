#include <stdio.h>
#include <stdlib.h>
int pick=3;

int main()
{
    printf("%d \n",guessNum(3));
    return 0;
}
int guessNum(int n)
{
    int low=1,high=n,mid;
    /*for(i=0;i<n;i++)
        a[i]=i+1;*/
    while(1)
    {
        mid=(high+low)/2;
        //if(guess(mid)==1&&(mid==n-2)) return a[mid+1];
        if(guess(mid)==-1)
            high=mid-1;//-1?
        else if(guess(mid)==1)
            low=mid+1;
        else if(guess(mid)==0)
            return mid;
    }
}

int guess(int n)
{
    if(pick<n)
        return -1;
    else if(pick>n)
        return 1;
    else if(pick==n)
        return 0;
}
