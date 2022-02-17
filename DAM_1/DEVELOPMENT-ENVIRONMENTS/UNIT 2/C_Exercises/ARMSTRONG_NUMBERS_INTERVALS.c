#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>  

void printArmstrongNumber(int num);

int main()
{
	int n, n2, max, min;

	printf("Enter a number:\n");
	scanf("%d", &n);

	printf("Enter a number:\n");
	scanf("%d", &n2);

	if (n2 > n)
	{
		max = n2;
		min = n;
	}
	else
	{
		max = n;
		min = n2;
	}
	for (int i = min; i < max; i++)
	{
		printArmstrongNumber(i);
	}	
	return 0;
}

void printArmstrongNumber(int num) 
{
	int sum = 0, nCopy, rest;

	nCopy = num;
	while (num > 0)
	{
		rest = num % 10;
		sum = sum + (rest * rest * rest);
		num = num / 10;
	}
	if (nCopy == sum)
	{
		printf("%d.\n", num);
	}
}