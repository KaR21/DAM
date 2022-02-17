
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main()
{
    int n, i = 0, j = 0;

    printf("Enter a number to print a rombous:\n");
    scanf("%d", &n);

    for (i = 0; i < n; i++)
    {
        for (j = 2 * (n - i); j >= 0; j--)
        {
            printf(" ");
        }
        for (j = 0; j < (i * 2) - 1; j++)
        {
            printf("* ");
        }
        printf("\n");
    }

    for (i = n; i > 0; i--)
    {
        for (j = 2 * (n - i); j >= 0; j--)
        {
            printf(" ");
        }
        for (j = 0; j < (i * 2) - 1; j++)
        {
            printf("* ");
        }
        printf("\n");
    }

    return 0;
}
