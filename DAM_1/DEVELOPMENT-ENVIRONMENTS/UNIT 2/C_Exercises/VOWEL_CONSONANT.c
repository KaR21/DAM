
#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h> 
#include <string.h>

int main()
{
    char carac;

    printf("Write a caracter:");
    scanf("%c", &carac);

    switch (carac) 
    {
    case 'a': case'A': case'e': case'E':case 'i': case'I': case'o': case'O':case'u': case'U':
        printf("It is a vowel.\n");
        break;
    default:
        printf("It is a consonant.\n");
        break;
    }

    return 0;
}