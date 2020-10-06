#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main_prog_05_1()
{
	srand(time(0));
	int freq[10] = { 0 };
	int i, j, n=0, max;
	for (i = 0; i < 100; i++)
	{
	freq[ rand() % 10]++;
	}
	for (j = 0; j < 10; j++)
		printf("%d ", freq[j]);
	printf("\n");

	max = freq[0];
	for (j = 1; j < 10; j++)
	{
		if (max < freq[j])
			max = freq[j];
	}
	printf("난수발생 최대수 = %d \n", max);

	for (i = 0; i < 10; i++)
		if (max == freq[i])
			break;
	printf("가장 많이 나온수 =%d \n", i);

}