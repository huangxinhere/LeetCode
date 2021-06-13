#include <stdio.h>
#include <stdlib.h>
//可能数据整不全，太大了
int main()
{
    int n=5,i,j,k,a[100][100]={0},count=0;
    for(k=0;k<(n+1)/2;k++)
    {
        for(i=k,j=k;j<=n-k-1;j++)
            count=give(a,count,i,j);

        for(j-=1,i+=1;i<=n-1-k;i++)
            count=give(a,count,i,j);

        for(i-=1,j-=1;j>=k;j--)
            count=give(a,count,i,j);

        for(j+=1,i-=1;i>k;i--)
            count=give(a,count,i,j);

    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
            printf("%d\t",a[i][j]);
        printf("\n");
    }

    return 0;
}

int give(int a[][100],int count,int x,int y)
{
    count++;
    if(count==10)
        count=1;
    a[x][y]=count;
    return count;
}
