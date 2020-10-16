#include <stdio.h>
#include <math.h>


int main_tch_03()
{
	struct point {
		int x, y;
	};
	struct rect {
		struct point p1, p2;
	};
	int area, perimeter, xdiff, ydiff;

	struct rect r;
	printf("왼쪽 상단의 좌표 :  ");
	scanf_s("%d %d", &r.p1.x, &r.p1.y);
	printf("오른쪽 하단의 좌표 : ");
	scanf_s("%d %d", &r.p2.x, &r.p2.y);

	xdiff = r.p2.x - r.p1.x;
	ydiff = r.p2.y - r.p1.y;
	
	area = xdiff * ydiff;
	perimeter = 2 * xdiff + ydiff;
	printf("면적은 %d 이고 둘레는 %d 입니다. \n", area, perimeter);
	return 0;
}