#include <stdio.h>
#include <stdlib.h>

#define INT_MAX 2147483647
#define INT_MIN (-INT_MAX - 1)

int main(){
    if(isPalindrome(0))
    {
        printf("Yes\n");
    }
    else
        printf("No\n");
}

int isPalindrome(int x){
    int y=0,i,n=x,t;
    if(x<0 || (x%10==0 && x!=0)) return 0;//先排除有负号和末尾为0的
    for(;x!=0;)
    {
        if(y>=INT_MAX/10) return 0;//防止回文之后溢出
        t=x%10,x=x/10,y=y*10+t;
    }
    if(y!=n) return 0;
    else return 1;

}
