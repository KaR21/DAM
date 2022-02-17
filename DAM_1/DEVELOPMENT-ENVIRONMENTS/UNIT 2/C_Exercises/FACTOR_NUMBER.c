#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main()
{
    int n;

    printf("Enter a number:\n");
    scanf("%d", &n);
    
    for (int i = 1; i < n/2 + 1; i++)
    {
        if (n % i == 0)
        {
            printf("%d ", i);
        }
    }
    printf("%d\n", n);

    return 0;
}