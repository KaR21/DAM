#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
#include <string.h>

int main()
{
    char carac;

    printf("Write a caracter:");
    scanf("%c", &carac);
    carac = tolower(carac);

    if (carac >= 'a' && carac <= 'z')
    {
        printf("The character <%c> is a letter\n", carac);
    }
    else
    {
        printf("The character <%c> is not a letter\n", carac);
    }
    return 0;
}
