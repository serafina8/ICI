#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main_prog_05()
{
	int freq[10] = { 0 }; //�迭�濡 ������ �ؾ��ϹǷ� 0 ���� �ʱ�ȭ
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
	printf("���� ���� ���¼� =%d \n", max_n);
	return 0;
}