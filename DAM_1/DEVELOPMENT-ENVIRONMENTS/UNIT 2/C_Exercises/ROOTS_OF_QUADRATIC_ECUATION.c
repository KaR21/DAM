#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<math.h>

int main()
{
    int a, b, c;
    double r1 = 0, r2 = 0;

    printf("Enter a number:\n");
    scanf("%d", &a);
    printf("Enter a number:\n");
    scanf("%d", &b);
    printf("Enter a number:\n");
    scanf("%d", &c);

    r1 = (-b + sqrt(pow(b, 2) - (4 * a * c))) / 2 * a;
    r2 = (-b - sqrt(pow(b,2)- (4*a*c)))/2*a;

    printf("The results are %.2f and %.2f.\n", r1, r2);

    return 0;
}