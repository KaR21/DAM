#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 

int reverseANumber(int number);

int main()
{
    int number, repeat = 1, reversed = 0;

    do 
    {
        printf("Enter a number to reverse it:\n");
        scanf("%d", &number);
        reversed = reverseANumber(number);
        printf("The reversed number is %d\n\n", reversed);
        reversed = 0;
        printf("Do you want to enter a new number?(1 for yes, 0 for no)\n");
        scanf("%d", &repeat);
    } while (repeat == 1); 
}

int reverseANumber(int number)
{
    int digit = 0, numberReversed = 0;

    while (number > 0)
    {
        digit = number % 10;
        numberReversed = numberReversed * 10 + digit;
        number /= 10;
    }

    return numberReversed;
}