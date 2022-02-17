#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main()
{
    int n, i = 2, f = 1, before = 0, start = 1;
    char str[128];

    printf("Enter a number to see the fibonacci series:\n");
    scanf("%d", &n);

    if (n == 0 || n == 1)
    {
        printf("Fibonacci : %d\n", n);
    }
    else
    {
        printf("Fibonacci[1] : 1\n");
        while (i <= n)
        {
            f = before + start;
            before = start;
            start = f;
            printf("Fibonacci[%d] : %d\n", i, f);
            i++;
        }
    }

    return 0;
}