#include <stdio.h>

struct student {
	int number;
	char name[10];
	double grade;
};

int main_tch_01_structEx()
{
	struct student s1;

	printf("�й��Է� : ");
	scanf_s("%d", &s1.number);
	printf("�����Է� : ");
	scanf_s("%s", s1.name);
	printf("�����Է� : ");
	scanf_s("%lf", &s1.grade);

	printf("�й� : %d\n", s1.number);
	printf("�й� : %s\n", s1.name);
	printf("�й� : %lf\n", s1.grade);
}