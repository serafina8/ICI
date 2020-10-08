#include <stdio.h>

void array_add(int* A, int* B, int* C, int size)
{
	int i;
	for (i = 0; i < size; i++)
		*(C + i) = *(A + i) + *(B + i);
}

int main_prog_07() {
	int A[10] = { 1,2,3 };
	int B[10] = { 1,2,3 };
	int C[10];
	int i, size;
	size = sizeof(A) / sizeof(A[0]);

	array_add(A, B, C, size);
	printf("A[]=");
	for (i = 0; i < size; i++)
		printf("%3d ", A[i]);

	printf("\n"); printf("B[]=");
	for (i = 0; i < size; i++)
		printf("%3d ", B[i]);

	printf("\n"); printf("C[]=");
	for (i = 0; i < size; i++)
		printf("%3d ", C[i]);
	printf("\n");
}