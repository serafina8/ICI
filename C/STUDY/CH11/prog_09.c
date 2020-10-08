#include <stdio.h>

int search(int* a, int size, int value)
{
	int i;
	for (i = 0; i < size; i++)
		if (*(a + i) == value)
			return i;
	return -1;
}

int main_prog_09()
{
	int a[] = { 100, 200, 300, 400, 500, 600 }, i, size,
		search_salary, result;
	size = sizeof(a) / sizeof(a[0]);

	printf("ã�����ϴ� ���� �Է�: ");
	scanf_s("%d", &search_salary);
	result = search(a, size, search_salary);

	if (result == -1)
		printf("ã�� ������ �����ϴ�. \n");
	else
		printf("������ %d������ ����� �ε���=%d\n", search_salary, result);
}