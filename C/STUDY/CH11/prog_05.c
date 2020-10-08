#include <stdio.h>

void convert(double* grades, double* scores, int size)
{
	int i;
	for (i = 0; i < size; i++)
		scores[i] = grades[i] / 4.3 * 100;
}

int main_prog_05()
{
	double grades[] = { 2.5, 1.5, 3.5, 4.2, 4.1, 3.8, 3.7, 4.0, 2.9, 4.3 };
	double scores[10];
	int i, size;
	size = sizeof(grades) / sizeof(grades[i]);
	convert(grades, scores, size);

	for (i = 0; i < 10; i++)
		printf("%6.2f ", grades[i]);
	printf("\n");
	for (i = 0; i < 10; i++)
		printf("%6.2f ", scores[i]);
	printf("\n");
}