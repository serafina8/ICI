#include <stdio.h>
#include <string.h>

int mystery(const char* s1, const char* s2)
{
	while (*s1 == *s2)
	{
		if (*s1 == 0)
			return (0);
		s1++; s2++;
	}
	return(1);
}

int main_p555_exercise10()
{
	char a[] = "abc";
	char b[] = "abd";
	mystery(a, b);
	printf("%d", mystery(a, b));
	return 0;
}