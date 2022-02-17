#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

int main()
{
    int number, i = 0;

    printf("Write a number to find the multiplication table:\n");
    scanf("%d", &number);

    do
    {
        printf("%d*%d = %d\n", number, i, i * number);
        i++;

    } while (i != 11);

    return 0;
}