isascii（测试字符是否为ASCII 码字符）
相关函数
iscntrl
表头文件
#include <ctype.h>
定义函数
int isascii(int c);
函数说明
检查参数c是否为ASCII码字符，也就是判断c的范围是否在0到127之间。
返回值
若参数c为ASCII码字符，则返回TRUE，否则返回NULL(0)。
附加说明
此为宏定义，非真正函数。
范例
/* 判断int i是否具有对映的ASCII码字符*/
#include<ctype.h>
main()
{
int i;
for(i=125;i<130;i++)
if(isascii(i))
printf("%d is an ascii character:%c\n",i,i);
else
printf("%d is not an ascii character\n",i);
}
执行
125 is an ascii character:}
126 is an ascii character:~
127 is an ascii character:
128 is not an ascii character
129 is not an ascii character