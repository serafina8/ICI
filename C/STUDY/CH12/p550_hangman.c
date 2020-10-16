#include <stdio.h>
#include <string.h>
#include <time.h>

void underline(char s[], char a[]);
int check(char s[], char a[], int ch);

int main_p550_hangman()
{
	char solution[3][100] = {
		"Meet at midnight",
		"Good morning",
		"sample test" };
	char answer[100] = { ' ' };
	char ch;
	srand(time(0));
	int i=0;
	int rnd = rand() % 3;
	underline(solution[rnd], answer );

	while (1)
	{
		printf("문자열 입력: %s \n", answer);
		printf("글자를 추측하시오: ");
		ch = getchar();
		if (check(solution, answer, ch) == 1) {
			printf("정답입니다. \n");
			break;
		}
		getchar(); //줄바꿈 문자 제거

	}
}

void underline(char s[], char a[])
{
	int i = 0;
	while (s[i] != 0)  //while (*(s+i) != 0)
	{
		if (s[i] != ' ')
			a[i] = '_';
		else
			a[i] = ' ';
		i++;
	}
}

int check(char s[], char a[], int ch)
{
	static int cnt;
	int i, check=0;
	for (i = 0; s[i] != NULL; i++)
		if (s[i] == ch)
		{
			a[i] = ch;
			check = 1;
		}
	if (check == 0)
	{
		cnt++;
		printf("%d회 틀렸습니다.\n", cnt);
	}
	if (cnt >= 5)
	{
		printf("횟수 초과되었습니다. 게임오버\n");
		exit(0);
	}
	if (strcmp(s, a) == 0)
		return 1;
	else return 0;

}