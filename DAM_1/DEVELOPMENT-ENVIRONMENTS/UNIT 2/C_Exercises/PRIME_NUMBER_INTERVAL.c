#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int isPrimeNumber(int n);

int main()
{
    int s, e;

    printf("Enter a start:\n");
    scanf("%d", &s);
    printf("Enter a end:\n");
    scanf("%d", &e);

    for (int i = s; i <= e; i++)
    {
        if (isPrimeNumber(i))
        {
            printf("%d ", i);
        }
    }

    return 0;
}

int isPrimeNumber(int n)
{

    int division = 2, prime = 1;

    if (n == 1) prime = 1;
    else
    {
        while ((division * division <= n) && (prime == 1))
        {
            if (n % division == 0)
            {
                prime = 0;
            }
            division++;
        }
    }

    return prime;
}