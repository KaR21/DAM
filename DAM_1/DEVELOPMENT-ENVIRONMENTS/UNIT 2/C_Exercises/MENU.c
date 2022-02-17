#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int sumNaturalNumbers(void);
int factorial(void);
void printMultiplicationTable(void);
void printFibonacciSeries(void);
int HCF(int number1, int number2);

int main()
{
    int option = -1, sum = 0, f, number1, number2;
    
    while (option != 0)
    {
        printf("--------------MENU--------------\n");
        printf("0) EXIT\n");
        printf("1) Find Sum of Natural Numbers\n");
        printf("2) Find Factorial of a Number\n");
        printf("3) Generate multiplication table\n");
        printf("4) Display fibonacci series\n");
        printf("5) Find HCF of two Numbers\n");

        printf("What option do you want to see?\n");
        scanf("%d", &option);
        switch (option)
        {
        case 1:
            sum = sumNaturalNumbers();
            printf("The sum of the numbers you enter is %d\n", sum);
            break;
        case 2:
            f = factorial();
            printf("The factorial of the number you enter is %d\n", f);
            break;
        case 3:
            printMultiplicationTable();
            break;
        case 4:
            printFibonacciSeries();
            break;
        case 5:
            printf("Write a number to find the HCF:\n");
            scanf("%d", &number1);

            printf("Write another number to find the HCF:\n");
            scanf("%d", &number2);

            printf("The highest common factor between %d and %d is %d\n", number1, number2, HCF(number1, number2));
            break;
        }

        printf("What option do you want to see?\n");
        scanf("%d", &option);
    }

    return 0;
}

int sumNaturalNumbers(void)
{
    int number, sum = 0;

    do
    {
        printf("Write a number (-1 to exit) to do a sum of natural numbers:\n");
        scanf("%d", &number);

        if (number > 0)
        {
            sum = sum + number;
        }

    } while (number != -1);

    return sum;
}

int factorial(void)
{
    int number, fac = 1;

    printf("Write a number to find the factorial:\n");
    scanf("%d", &number);
    do
    {
        fac = fac * number;
        number--;
    } while (number != 0);

    return fac;
}

void printMultiplicationTable(void)
{
    int number, i = 0;

    printf("Write a number to see the multiplication table:\n");
    scanf("%d", &number);

    do
    {
        printf("%d*%d = %d\n", number, i, i * number);
        i++;

    } while (i != 11);
}

void printFibonacciSeries(void)
{
    int number, i = 2, f = 1, before = 0, start = 1;

    printf("Write a number to see the fibonacci serie:\n");
    scanf("%d", &number);
    if (number == 0 || number == 1)
    {
        printf("Fibonacci : %d\n", number);
    }
    else
    {
        printf("Fibonacci[1] : 1\n");
        while (i <= number)
        {
            f = before + start;
            before = start;
            start = f;
            printf("Fibonacci[%d] : %d\n", i, f);
            i++;
        }
    }
}

int HCF(int number1, int number2)
{
    int max, min, result;

    if (number1 > number2)
    {
        max = number1;
        min = number2;
    }
    else
    {
        max = number2;
        min = number1;
    }

    do
    {
        result = min;
        min = max % min;
        max = result;
    } while (min != 0);

    return result;
}