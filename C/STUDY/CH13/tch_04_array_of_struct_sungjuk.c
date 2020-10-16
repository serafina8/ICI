#include <stdio.h>
#include <math.h>
#define CNT 3

struct sungjuk get_max_stu(struct sungjuk *pyc, int n);

struct sungjuk {
	char name[10];
	int kor, eng, mat, tot, rank;
	double ave;
};

int main_tch_04_array_of_struct_sungjuk()
{
	struct sungjuk pyc[CNT], temp, top_student;
	int i, j;

	printf("%d���� �����Է� \n", CNT);
	for (i = 0; i < CNT; i++)
	{
		printf("%d �� �����Է� : ", i + 1);
		scanf_s("%s", pyc[i].name, sizeof(pyc[i].name));
		printf("%d �� �����Է� : ", i + 1);
		scanf_s("%d", &pyc[i].kor);
		printf("%d �� �����Է� : ", i + 1);
		scanf_s("%d", &pyc[i].eng);
		printf("%d �� �����Է� : ", i + 1);
		scanf_s("%d", &pyc[i].mat);
		pyc[i].tot = pyc[i].kor + pyc[i].eng + pyc[i].mat;
		pyc[i].ave = pyc[i].tot /3.0;
		pyc[i].rank = 1;
	}

	for(i=0; i<CNT-1; i++)
		for(j=i+1; j<CNT; j++)
			if (strcmp(pyc[i].name, pyc[j].name) > 0)
			{
				temp = pyc[i];
				pyc[i] = pyc[j];
				pyc[j] = temp;
			}

	for (i = 0; i < CNT - 1; i++)
		for (j = i + 1; j < CNT; j++)
			if (pyc[i].tot > pyc[j].tot)
				pyc[j].rank++;
			else if (pyc[i].tot < pyc[j].tot)
				pyc[i].rank++;

	/*for (i = 0; i < CNT - 1; i++)
		for (j = i + 1; j < CNT; j++)
			if (pyc[i].rank > pyc[j].rank)
			{
				temp = pyc[i];
				pyc[i] = pyc[j];
				pyc[j] = temp;
			}*/

	printf(" ����  ����  ����  ����  ����  ���  ����\n");
	for (i = 0; i < CNT; i++)
		printf("%6s%6d%6d%6d%6d%6.1f%5d\n", pyc[i].name, pyc[i].kor, pyc[i].eng, pyc[i].mat, pyc[i].tot, pyc[i].ave, pyc[i].rank);

	//top_student = pyc[0];
	top_student = get_max_stu(pyc, CNT);
	/*for (i = 1; i < CNT; i++)
		if (top_student.tot < pyc[i].tot)
			top_student = pyc[i];*/
	printf("������ ���� ���� �л��� �̸� : %s, ����: %d, ���: %f�Դϴ�.", top_student.name, top_student.tot, top_student.ave);
}

struct sungjuk get_max_stu(struct sungjuk *pyc, int n)
{
	struct sungjuk top_student = *pyc;
	int i;

	for (i = 1; i < n; i++)
		if (top_student.tot < (*(pyc+i)).tot)

			top_student = *(pyc+i);
	return top_student;
}