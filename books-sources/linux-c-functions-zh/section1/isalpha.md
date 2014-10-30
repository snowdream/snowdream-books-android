isalpha （测试字符是否为英文字母）
相关函数
isalnum，islower，isupper
表头文件
#include<ctype.h>
定义函数
int isalpha (int c)
函数说明
检查参数c是否为英文字母，在标准c中相当于使用“isupper(c)||islower(c)”做测试。
返回值
若参数c为英文字母，则返回TRUE，否则返回NULL(0)。
附加说明
此为宏定义，非真正函数。
范例
/* 找出str 字符串中为英文字母的字符*/
#include <ctype.h>
main()
{
char str[]=”123c@#FDsP[e?”;
int i;
for (i=0;str[i]!=0;i++)
if(isalpha(str[i])) printf(“%c is an alphanumeric character\n”,str[i]);
}
执行
c is an apphabetic character
F is an apphabetic character
D is an apphabetic character
s is an apphabetic character
P is an apphabetic character
e is an apphabetic character