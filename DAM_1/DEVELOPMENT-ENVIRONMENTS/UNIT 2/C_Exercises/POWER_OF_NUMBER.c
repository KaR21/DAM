#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

int main()
{
    int number, power, result = 1;

    printf("Enter a number:\n");
    scanf("%d", &number);
    printf("Enter the power:\n");
    scanf("%d", &power);


    for (int i = 0; i < power; i++)
    {
        result = result * number;
    }

    printf("The result is: %d", result);
    return 0;
}