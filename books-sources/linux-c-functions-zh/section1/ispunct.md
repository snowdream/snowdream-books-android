ispunct（测试字符是否为标点符号或特殊符号）
相关函数
isspace，isdigit，isalpha
表头文件
#inlude<ctype.h>
定义函数
int ispunct(int c)
函数说明
检查参数c是否为标点符号或特殊符号。返回TRUE也就是代表参数c为非空格、非数字和非英文字母。
返回值
v若参数c为标点符号或特殊符号，则返回TRUE，否则返回NULL(0)。
附加说明
此为宏定义，非真正函数。
范例
/*列出字符串str中的标点符号或特殊符号*/
#include <ctype.h>
main()
{
char str[]="123c@ #FDsP[e?";
int i;
for(i=0;str[i]!=0;i++)
if(ispunct(str[i])) printf("%c\n",str[i]);
}
执行
v
@#[?