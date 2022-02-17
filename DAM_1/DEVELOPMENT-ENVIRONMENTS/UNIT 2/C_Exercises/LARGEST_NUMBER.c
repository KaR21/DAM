#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>

int main()
{
    int a, b, c, max = 0;

    printf("Enter a number:\n");
    scanf("%d", &a);
    printf("Enter a number:\n");
    scanf("%d", &b);
    printf("Enter a number:\n");
    scanf("%d", &c);

    if (a > b)
    {
        max = a;
    }
    else 
    {
        max = b;
    }

    if (c > max)
    {
        max = c;
    }

    printf("The biggest number: %d.\n", max);

    return 0;
}