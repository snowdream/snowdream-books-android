isdigit（测试字符是否为阿拉伯数字）
相关函数
isxdigit
表头文件
#include<ctype.h>
定义函数
int isdigit(int c)
函数说明
检查参数c是否为阿拉伯数字0到9。
返回值
若参数c为阿拉伯数字，则返回TRUE，否则返回NULL(0)。
附加说明
此为宏定义，非真正函数。
范例
/* 找出str字符串中为阿拉伯数字的字符*/
#include<ctype.h>
main()
{
char str[]="123@#FDsP[e?";
int i;
for(i=0;str[i]!=0;i++)
if(isdigit(str[i])) printf("%c is an digit character\n",str[i]);
}
执行
1 is an digit character
2 is an digit character
3 is an digit character