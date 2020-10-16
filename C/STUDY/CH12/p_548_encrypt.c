//#include <stdio.h>
//
//void encrypt(char cipher[], int shift)
//{
//	int i = 0;
//	while (cipher[i] != '\0')
//	{
//		if (isalpha(cipher[i])) 
//		{
//			cipher[i] += shift;
//			if (cipher[i] > 'z')
//				cipher[i] -= 26;
//		}
//		i++;
//	}
//	printf("암호화된 문자열 : %s \n", cipher);
//}
//
//int main()
//{
//	char cipher[50];
//	int shift = 3;
//	printf("문자열 입력: ");
//	gets_s(cipher, 50);
//	encrypt(cipher, shift);
//	return 0;
//}
