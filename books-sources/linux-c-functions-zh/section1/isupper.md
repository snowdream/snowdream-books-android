isupper（测试字符是否为大写英文字母）
相关函数
isalpha，islower
表头文件
#include<ctype.h>
定义函数
int isupper(int c)
函数说明
检查参数c是否为大写英文字母。
返回值
若参数c为大写英文字母，则返回TRUE，否则返回NULL(0)。
附加说明
此为宏定义，非真正函数。
范例
/*找出字符串str中为大写英文字母的字符*/
#include <ctype.h>
main()
{
char str[]="123c@#FDsP[e?";
int i;
for(i=0;str[i]!=0;i++)
if(isupper(str[i])) printf("%c is an uppercase character\n",str[i]);
}
执行
F is an uppercase character
D is an uppercase character
P is an uppercase character