#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>

int main()
{
    int year;

    printf("Enter a number:\n");
    scanf("%d", &year);

    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
        printf("The year entered (%d) is leap year", year);
    }
    else
    {
        printf("The year entered (%d) is not a leap year", year);
    }


    return 0;
}
