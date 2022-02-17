//On the presentation is the 5st exercise of the SwitchStatement part.
#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 

int main()
{
    int n;

    printf("Enter a number:\n");
    scanf("%d", &n);

    switch (n % 2)
    {
    case 0: 
        printf("The number, %d, is even.\n", n);
        break;
    case 1:
        printf("The number, %d, is odd.\n", n);
        break;
    }

    return 0;
}