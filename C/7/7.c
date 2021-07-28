#include <stdio.h>
#include <math.h>

#define INT_MAX 2147483647
#define INT_MIN (-INT_MAX - 1)

int main(){
    printf("%d",reverse(1534236469));
}

int reverse(int x){
    int num = 0,t;

    for ( ; x!=0 ; )
    {
        if (t < INT_MIN / 10 || t > INT_MAX / 10) {
            return 0;
        }
        t = x % 10;
        x /= 10;
        num = num * 10 + t;
    }

    return num;

}
