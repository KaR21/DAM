#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

int main()
{
    int number, fac = 1;

    printf("Write a number to find the factorial:\n");
    scanf("%d", &number);

    do
    {
        fac = fac * number;
        number--;
    } while (number != 0);

    printf("The factorial of the number you enter is %d\n", fac);

    return 0;
}