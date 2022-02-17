//On the presentation is the 4st exercise of the SwitchStatement part.
#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

int main()
{
    int a, b;

    printf("Write a number:");
    scanf("%d", &a);
    printf("Write a number:");
    scanf("%d", &b);

    switch (a < b)
    {
    case 0:
        printf("%d number is the maximun number.\n", a);
        break;

    case 1:
        printf("%d number is the maximun number.\n", b);
        break;
    }

    return 0;
}