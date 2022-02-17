//On the presentation is the 6st exercise of the SwitchStatement part.
#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

int main()
{
    int option;
    float a, b, sum, sub, m, d;

    printf("Enter a number:\n");
    scanf("%f", &a);
    printf("Enter another number:\n");
    scanf("%f", &b);

    printf("What do you want to do?:");
    printf("\n");
    printf("----------------MENU------------------\n");
    printf("1) Subtraction.\n");
    printf("2) Addition.\n");
    printf("3) Multiply.\n");
    printf("4) Division.\n");
    printf("--------------------------------------\n");
    

    printf("Enter the option:\n");
    scanf("%d", &option);
    switch (option)
    {
    case 1:
        sub = a - b;
        printf("The subtraction of the numbers %.2f and %.2f is %.2f", a, b, sub);
        break;
    case 2:
        sum = a + b;
        printf("The addition of the numbers %.2f and %.2f is %.2f", a, b, sum);
        break;
    case 3:
        m = a * b;
        printf("The multiply of the numbers %.2f and %.2f is %.2f", a, b, m);
        break;
    case 4:
        d = a / b;
        printf("The division of the numbers %.2f and %.2f is %.2f", a, b, d);
        break;
    default:
        printf("Enter a correct option.");
        break;
    }

    return 0;
}