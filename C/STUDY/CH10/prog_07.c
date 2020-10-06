#include <stdio.h>

int main_prog_07()
{
	int arr[10][3] = { 0 }, i, j;
	for (i = 0; i < 10; i++)
	{
		arr[i][0] = 1;
		for (j = 0; j < 3; j++)
		{
				if(j==0)
					arr[i][j] *=(i + 1);
				else
				arr[i][j] = arr[i][j-1]*(i + 1);

			printf("%4d ", arr[i][j]);
		}
		printf("\n");

	}

	
				

}