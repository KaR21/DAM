#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>  

int main()
{
	int n, rest, sum = 0, nCopy;

	printf("Enter a number:\n");
	scanf("%d", &n);

	nCopy = n;
	while (n > 0)
	{
		rest = n % 10;
		sum = sum + (rest * rest * rest);
		n = n / 10;
	}
	if (nCopy == sum)
		printf("The number you enteres is an armstrong  number.\n");
	else
		printf("The number you enteres is not an armstrong  number.\n");
	return 0;
}