#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

int main()
{
    int number, i, count = 0;

    for (i = 0; i != 15; i++) {
        printf("Enter a number:");
        scanf("%d", &number);
        if (number > 0) {
            count++;
        }
    }
    
    printf("There are %d positive numbers.\n", count);

    return 0;
}