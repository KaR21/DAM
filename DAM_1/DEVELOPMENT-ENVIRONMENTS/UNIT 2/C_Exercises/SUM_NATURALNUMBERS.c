#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

int main()
{
    int number, sum = 0;

    do
    {
        printf("Write a number (-1 to exit) to do a sum of natural numbers:\n");
        scanf("%d", &number);

        if (number > 0)
        {
            sum = sum + number;
        }

    } while (number != -1);

    printf("The sum of the numbers you enter is %d\n", sum);

    return 0;
}