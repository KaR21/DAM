#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

int main()
{
    int a, b, max, search = 0;

    printf("Write a number:\n");
    scanf("%d", &a);

    printf("Write a number:\n");
    scanf("%d", &b);

    if (a > b)
    {
        max = a;
    }
    else
    {
        max = b;
    }

    while (search == 0)
    {
        if (max % a == 0 && max % b == 0)
        {
            printf("The LCM of %d and %d is %d.", a, b, max);
            search = 1;
        }
        max++;
    }

    return 0;
}