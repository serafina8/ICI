#include <stdio.h>

void get_sum_diff(int x, int y, int* p_sum, int* p_diff);

int main_prog_02()
{
	int x = 100;
	int y = 200;
	int sum, diff;
	 
	get_sum_diff(x, y, &sum, &diff);

	printf("원소들의 합=%d\n", sum);
	printf("원소들의 차=%d\n", diff);
	return 0;
}

void get_sum_diff(int x, int y, int* sum, int* diff)
{
	*sum = x + y;
	*diff = x - y;
}