#include <stdio.h>
#include <math.h>

struct point {
	int x, y;
};

int main_tch_02_distance()
{
	struct point p1, p2;
	double dist;

	printf("점의 좌표 입력 : ");
	scanf_s("%d %d", &p1.x, &p1.y);
	printf("점의 좌표 입력 : ");
	scanf_s("%d %d", &p2.x, &p2.y);

	dist = sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
	printf("거리는 %f 입니다. \n", dist);
	return 0;
}