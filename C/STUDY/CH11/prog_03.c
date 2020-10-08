#include <stdio.h>

void array_fill(int* p, int size)
{
	int i;
	for (i = 0; i < size; i++)
		*(p + i) = rand(); //p[i]=rand();
}

int main_prog_03()
{
	int arr[10], i;
	srand(time(0));
	array_fill(arr, sizeof(arr) / sizeof(arr[0]));
	for (i = 0; i < 10; i++)
		printf("%d ", arr[i]);
	printf("\n");


}