#include <stdio.h>

void array_copy(int* A, int B[], int size)
{
	int i;
	for(i=0; i<size; i++)
	{
		B[i] = A[i]; // *(b+i) = *(a+i)
	}
}

int main_prog_06()
{
	int A[10] = { 1,2,3 }; 
	int B[10] = { 0 };
	int i, size;
	size = sizeof(A) / sizeof(A[0]);

	printf("A[]=");
	for (i = 0; i < size; i++)
		printf("%2d ", A[i]);
	printf("\n");

	array_copy(A, B, size);
	
	printf("A[]=");
	for (i = 0; i < size; i++)
		printf("%2d ", B[i]);
	printf("\n");

}