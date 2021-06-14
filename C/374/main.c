#include <stdio.h>
#include <stdlib.h>
int pick=2;

int main()
{
    printf("%d \n",guessNum(2));
    return 0;
}
int guessNum(int n)
{
    int a[n],i,low=0,high=n-1,mid;
    for(i=0;i<n;i++)
        a[i]=i+1;
    while(1)
    {
        mid=(high+low)/2;
        if(guess(a[mid])==1&&(mid==n-2)) return a[mid+1];
        if(guess(a[mid])==-1)
            high=mid;
        else if(guess(a[mid])==1)
            low=mid;
        else if(guess(a[mid])==0)
            return a[mid];
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
