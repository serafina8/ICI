#include <stdio.h>

union example {
	int i;
	char c;
};

	union example v; //자동초기화, 전역변수
int main_p586_union()
{
	//union example v;

	v.c = 'A';
	printf("v.c:%c v.i:%d\n", v.c, v.i);
	 
	v.i = 10000;
	printf("v.c:%c v.i:%#X\n", v.c, v.i); // %#X

}