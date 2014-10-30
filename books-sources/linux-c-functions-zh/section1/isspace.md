isspace（测试字符是否为空格字符）
<pre>相关函数
isgraph
表头文件
#include< ctype.h>
定义函数
int isspace(int c)
函数说明
检查参数c是否为空格字符，也就是判断是否为空格('')、定位字符('\t')、CR('\r')、换行('\n')、垂直定位字符('\v')或翻页('\f')的情况。
返回值
若参数c为空格字符，则返回TRUE，否则返回NULL(0)。
附加说明
此为宏定义，非真正函数。
范例
/*将字符串str[]中内含的空格字符找出，并显示空格字符的ASCII码*/
#include < ctype.h>
main()
{
char str="123c @# FD\tsP[e?\n";
int i;
for(i=0;str[i]!=0;i++)
if(isspace(str[i]))
printf("str[%d] is a white-space character:%d\n",i,str[i]);
}
执行
str[4] is a white-space character:32
str[7] is a white-space character:32
str[10] is a white-space character:9 /* \t */
str[16] is a white-space character:10 /* \t */</pre>