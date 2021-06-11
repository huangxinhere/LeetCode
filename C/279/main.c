#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int n=12,d[101]={0},i,t[100]={0};

    printf("%d\n",numSquares(n));
    return 0;
}
int numSquares(int n) {
    int f[n + 1],i,j;
    f[0] = 0;
    for (i = 1; i <= n; i++) {
        int INT_MAX=2147483647;
        int minn = INT_MAX;
        for ( j = 1; j * j <= i; j++) {
            minn = fmin(minn, f[i - j * j]);
        }
        f[i] = minn + 1;
    }
    return f[n];
}
//1-1=0,f[0]=0
//2-1=1,减数（本身算为一个数）加右边的数包含最少几个平方数
//3-1=2
//4-1=3,4-4=0,很明显右边情况个数更少——min来记录最小的
//5-1=4,5-4=1
//6-1=5,6-4=2
//...
/*
**数组存储小的结果
**还是觉得太巧妙了难以学习...
*/
