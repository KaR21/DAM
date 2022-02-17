#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

int main()
{
    int number, dSum = 0, numberCopy;

    printf("Enter a number to sum its quantity of digits:\n");
    scanf("%d", &number);

    numberCopy = number;
    while (number > 0)
    {
        dSum++;
        number = number / 10;
    }

    printf("The count of the digits that the number %d is: %d.\n",numberCopy, dSum);
}