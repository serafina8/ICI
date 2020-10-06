#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main_prog_05()
{
	int freq[10] = { 0 }; //배열방에 누적을 해야하므로 0 으로 초기화
	srand(time(0));
	int i, j;
	for (i = 0; i < 100; i++)
		freq[ rand() % 10]++;
	for (j = 0; j < 10; j++)
		printf("%d ", freq[j]);
	printf("\n");
	int sum = 0;
	for (j = 0; j < 10; j++)
		sum += freq[j];
	printf("%d \n", sum);

	int max = freq[0];
	int max_n = 0;
	for (j = 1; j < 10; j++)
	{
	
		if (max < freq[j])
		{
			max = freq[j];
			max_n = j;
		}
	}
	printf("가장 많이 나온수 =%d \n", max_n);
	return 0;
}