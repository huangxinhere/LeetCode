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
//2-1=1,������������Ϊһ���������ұߵ����������ټ���ƽ����
//3-1=2
//4-1=3,4-4=0,�������ұ�����������١���min����¼��С��
//5-1=4,5-4=1
//6-1=5,6-4=2
//...
/*
**����洢С�Ľ��
**���Ǿ���̫����������ѧϰ...
*/
