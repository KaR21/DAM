#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

void exercise1(void);
void exercise2(void);
void exercise3(void);
void exercise4(void);
void exercise5(void);

int main()
{
    printf("Get the adittion and multiplication of even numbers between 20 and 50\n");
    //exercise1();
    printf("\n");

    printf("Read 15 numbers and say how many are positive\n");
    //exercise2();
    printf("\n");

    printf("Calculate the average of 20 numbers introduced from keyboard\n");
    //exercise3();
    printf("\n");

    printf("Read a positive number fron the keyboard and say how many digits it has\n");
    //exercise4();
    printf("\n");

    printf("Read a number fron the keyboard and make a program that displays it backwards\n");
    exercise5();
    printf("\n");

    return 0;
}

void exercise1(void) {
    int number = 20, adittion = 0;
    double multiplication = 1; //it´s long for a int 32 bits while double has 64

    while (number >= 20 && number <= 50)
    {
        if (number % 2 == 0)
        {
            adittion = adittion + number;
            multiplication = multiplication * number;
        }
        number++;
    }

    printf("The sum of the numbers is %d\n", adittion);
    printf("The multiplication of the numbers is %f\n", multiplication);
}

void exercise2(void) {
    int number, i, count = 0;

    for (i = 0; i != 15; i++) {
        printf("Enter a number:");
        scanf("%d", &number);
        if (number > 0) {
            count++;
        }
    }

    printf("There are %d positive numbers.\n", count);
}

void exercise3(void) {
    int number, i;
    float average = 0;

    for (i = 0; i != 20; i++) {
        printf("Enter a number:");
        scanf("%d", &number);
        average = average + number;
    }

    average = average / 20;
    printf("The average of the numbers you entered is %f.\n", average);
}

void exercise4(void) {
    int number, count = 0;

    printf("Enter a number:");
    scanf("%d", &number);

    while (number > 0) {
        count++;
        number = number / 10;
    }

    printf("The cuantity of digits of the number you entered is %d.\n", count);
}

void exercise5(void) {
    int number, digits = 0, reversed = 0;

    printf("Enter a number:");
    scanf("%d", &number);

    while (number > 0) {
        digits = number % 10;
        reversed = reversed * 10 + digits;
        number = number / 10;
    }

    printf("The reversed number is: %d.\n", reversed);
}