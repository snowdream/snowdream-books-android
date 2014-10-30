isxdigit（测试字符是否为16进制数字）
<pre>相关函数
isalnum，isdigit
表头文件
#include< ctype.h>
定义函数
int isxdigit (int c)
函数说明
检查参数c是否为16进制数字，只要c为下列其中一个情况则返回TRUE。16进制数字:0123456789ABCDEF。
返回值
若参数c为16进制数字，则返回TRUE，否则返回NULL(0)。
附加说明
此为宏定义，非真正函数。
范例
/*找出字符串str中为十六进制数字的字符*/
#include < ctype.h>
main()
{
char str[]="123c@#FDsP[e?";
int i;
for(i=0;str[i]!=0;i++)
if(isxdigit(str[i])) printf("%c is a hexadecimal digits\n",str[i]);
}
执行
1 is a hexadecimal digits
2 is a hexadecimal digits
3 is a hexadecimal digits
c is a hexadecimal digits
F is a hexadecimal digits
D is a hexadecimal digits
e is a hexadecimal digits</pre>