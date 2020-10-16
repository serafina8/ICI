#include <stdio.h>

struct student {
	int number;
	char name[10];
	double grade;
};

int main_tch_01_structEx()
{
	struct student s1;

	printf("학번입력 : ");
	scanf_s("%d", &s1.number);
	printf("성명입력 : ");
	scanf_s("%s", s1.name);
	printf("학점입력 : ");
	scanf_s("%lf", &s1.grade);

	printf("학번 : %d\n", s1.number);
	printf("학번 : %s\n", s1.name);
	printf("학번 : %lf\n", s1.grade);
}