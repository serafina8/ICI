#include <stdio.h>
#include <math.h>

struct point {
	int x, y;
};

int main_tch_02_distance()
{
	struct point p1, p2;
	double dist;

	printf("���� ��ǥ �Է� : ");
	scanf_s("%d %d", &p1.x, &p1.y);
	printf("���� ��ǥ �Է� : ");
	scanf_s("%d %d", &p2.x, &p2.y);

	dist = sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
	printf("�Ÿ��� %f �Դϴ�. \n", dist);
	return 0;
}