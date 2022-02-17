#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main()
{
    int division = 2, n, prime = 1;

    printf("Enter a number:\n");
    scanf("%d", &n);

    if (n == 1) printf("Your number is not a prime number.\n");
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

        if (prime) printf("Your number is a prime number.\n");
        else printf("Your number is not a prime number.\n");
    }

    return 0;
}