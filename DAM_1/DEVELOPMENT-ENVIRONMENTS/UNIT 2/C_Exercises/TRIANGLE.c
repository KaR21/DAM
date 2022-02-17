#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

void reversedTriangle(int number);
void numbersTriangle(int number);
void piramid(int n);

int main()
{
    int n, i = 0, j = 0;

    printf("Enter a number to print a triangle:\n");
    scanf("%d", &n);

    for (i = 0; i < n; i++)
    {
        printf("\n");
        for (j = 0; j < i + 1; j++)
        {
            printf("*");
        }
    }
    printf("\n");

    reversedTriangle(n);
    numbersTriangle(n);
    piramid(n);

    return 0;
}

void reversedTriangle(int number)
{
    for (int i = 0; i < number; i++)
    {
        printf("\n");
        for (int j = i; j < number; j++)
        {
            printf("*");
        }
    }
    printf("\n");
}

void numbersTriangle(int number)
{
    for (int i = 0; i < number; i++)
    {
        printf("\n");
        for (int j = 1; j <= i + 1; j++)
        {
            printf("%d", j);
        }
    }
    printf("\n");
}

void piramid(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - i; j++)
        {
            printf(" ");
        }
        for (int j = 1; j <= 2 * i - 1; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}