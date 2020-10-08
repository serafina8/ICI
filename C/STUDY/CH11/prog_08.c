#include <stdio.h>

int array_sum(int* A, int size)
{
	int i, sum=0;
	for (i = 0; i < size; i++)
		sum += *(A + i);
	return sum;
}

int main_prog_08()
{
	int A[10] = { 1,2,3 };
	int i, size, result;
	size = sizeof(A) / sizeof(A[0]);
	result = array_sum(A, size);

	for (i = 0; i < size; i++)
		printf("%3d ", A[i]);
	printf("\n");
	printf("월급의 합 = %d\n", result);
}