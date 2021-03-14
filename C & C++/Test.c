#include <stdio.h>
int main()
{
    printf("Enter first Number: ");
    int number;
    scanf("%d", &number);
    printf("Enter Second Number: ");
    int second;
    scanf("%d", &second);
    int sum=number+second;
    printf("Total is : %d", sum);

    return 0;
}