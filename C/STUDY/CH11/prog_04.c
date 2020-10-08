#include <stdio.h>

void array_print(int* p, int size)
{
	int i;
	printf("A[]={ ");
	for (i = 0; i < size; i++)
		printf("%d, ", *(p + i));
	printf("\b\b }\n");
}


int main_prog_04()
{
	int arr[] = { 1, 2, 3, 4, 5, 6 };
	int size;
	size = sizeof(arr) / sizeof(arr[0]);
	array_print(arr, size);
}