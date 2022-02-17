#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

int main()
{
    int number, number2, max, min, result;

    printf("Write a number:\n");
    scanf("%d", &number);

    printf("Write a number:\n");
    scanf("%d", &number2);

    if (number > number2) 
    {
        max = number;
        min = number2;
    }
    else
    {
        max = number2;
        min = number;
    }

    do
    {
        result = min;
        min = max % min;
        max = result;
    } while (min != 0);

    printf("The highest common factor between %d and %d is %d\n", number, number2, result);

    return 0;
}
