#include <stdio.h>

union example {
	int i;
	char c;
};

	union example v; //�ڵ��ʱ�ȭ, ��������
int main_p586_union()
{
	//union example v;

	v.c = 'A';
	printf("v.c:%c v.i:%d\n", v.c, v.i);
	 
	v.i = 10000;
	printf("v.c:%c v.i:%#X\n", v.c, v.i); // %#X

}