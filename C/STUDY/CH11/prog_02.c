#include <stdio.h>

void get_sum_diff(int x, int y, int* p_sum, int* p_diff);

int main_prog_02()
{
	int x = 100;
	int y = 200;
	int sum, diff;
	 
	get_sum_diff(x, y, &sum, &diff);

	printf("���ҵ��� ��=%d\n", sum);
	printf("���ҵ��� ��=%d\n", diff);
	return 0;
}

void get_sum_diff(int x, int y, int* sum, int* diff)
{
	*sum = x + y;
	*diff = x - y;
}