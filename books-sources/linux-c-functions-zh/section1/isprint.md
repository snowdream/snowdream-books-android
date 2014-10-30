isprint（测试字符是（否为可打印字符）
<pre>相关函数
isgraph
表头文件
#include< ctype.h>
定义函数
int isprint(int c);
函数说明
检查参数c是否为可打印字符，若c所对映的ASCII码可打印，其中包含空格字符，则返回TRUE。
返回值
若参数c为可打印字符，则返回TRUE，否则返回NULL(0)。
附加说明
此为宏定义，非真正函数。
范例
/* 判断str字符串中哪些为可打印字符包含空格字符*/
#include< ctype.h>
main()
{
char str[]="a5 @;";
int i;
for(i=0;str[i]!=0;i++)
if(isprint(str[i])) printf("str[%d] is printable character:%d\n",i,str[i]);
}
执行
str[0] is printable character:a
str[1] is printable character:5
str[2] is printable character:
str[3] is printable character:@
str[4] is printable character:;</pre>