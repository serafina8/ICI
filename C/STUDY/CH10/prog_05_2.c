#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// 이거는 틀린 예제임.. 출판사 정답이 틀렸음 !!


//int main()
//{
//	int freq[10] = { 0 };
//	int i, j, max;
//
//	for (i = 0; i < 100; i++)
//	{
//		++freq[rand() % 10];
//	}
//
//	for (j = 0; j < 10; j++)
//		printf("%d ", freq[j]);
//	printf("\n");
//
//	max = 0;
//	for (i = 1; i < 10; i++)
//	{
//		if (freq[i] > max)
//			max = i;
//	printf("가장 많이 나온수 =%d \n", max);
//	}
//
//	return 0;
//}

//int main(void)
//{
//	int freq[10] = { 0 };
//	int i, max;
//	srand(time(0));
//	for (i = 0; i < 100; i++) {
//		++freq[rand() % 10];
//	}
//	for (i = 0; i < 10; i++)
//		printf("%d\n", freq[i]);
//
//	max =0;
//	for (i = 0; i < 10; i++) {
//
//		if (freq[i] > max)
//			max = i;
//	}
//	printf("가장 많이 나온수=%d\n", max);
//	return 0;
//}