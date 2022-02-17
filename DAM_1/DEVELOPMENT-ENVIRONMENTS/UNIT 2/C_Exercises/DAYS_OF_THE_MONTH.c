
#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

int main()
{
    int month;

    printf("Write a number between 1 and 12:");
    scanf("%d", &month);

    switch (month)
    {
    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        printf("This month has 31 days.\n");
        break;
    case 4: case 6: case 9: case 11:
        printf("This month has 30 days.\n");
        break;
    case 2:
        printf("This month has 29 or 28 days.\n");
        break;
    
    default:
        printf("Enter a number between 1-12.\n");
        break;
    }

    return 0;
}