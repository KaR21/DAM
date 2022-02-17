#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main()
{
    int n, nCopy, rest = 0, palindrome = 0;

    printf("Enter a positive number:\n");
    scanf("%d", &n);

    nCopy = n;
    if (n >= 0)
    {
        while (nCopy > 0)
        {
            rest = nCopy % 10;
            nCopy = nCopy / 10;
            palindrome = (palindrome * 10) + rest;
        }

        if (palindrome == n)
        {
            printf("The number you entered (%d) is palindrome.\n", n);
        }
        else
        {
            printf("The number you entered (%d) is not palindrome.\n", n);
        }
    }
    else
    {
        printf("Enter a positive number.\n");
    }

    return 0;
}