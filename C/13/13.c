#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int func(char c)
{
    int sum;
    switch(c)
    {
        case 'I': sum=1;   break;
        case 'V': sum=5;   break;
        case 'X': sum=10;  break;
        case 'L': sum=50;  break;
        case 'C': sum=100; break;
        case 'D': sum=500; break;
        case 'M': sum=1000;break;
    }
    return sum;
}

int main(){
    char s[]="DCXXI";
    printf("%d\n",romanToInt(s));
}

int romanToInt(char * s){
    int len=strlen(s),i,sum=0,a,b;
    for(i=0;i<len;)
    {
        if((i+1)<len)
        {
            a=func(s[i]),b=func(s[i+1]);
            if(a<b) sum=b-a+sum,i+=2;
            else sum=a+sum,i++;
            continue;
        }
        sum=func(s[i])+sum,i++;
    }
    return sum;
}

//1.有特殊情况，是直接取情况的例子进行讨论，还是研究共有的规律？
//2.func函数要放在main函数的前面，否则会报“conflicting type for XX函数”，但romanToInt函数不用，为什么？
