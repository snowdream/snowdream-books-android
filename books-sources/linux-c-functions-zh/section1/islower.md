islower（测试字符是否为小写字母）
<pre>相关函数
isalpha，isupper
表头文件
#include< ctype.h>
定义函数
int islower(int c)
函数说明
检查参数c是否为小写英文字母。
返回值
若参数c为小写英文字母，则返回TRUE，否则返回NULL(0)。
附加说明
此为宏定义，非真正函数。
范例
#include< ctype.h>
main()
{
char str[]="123@#FDsP[e?";
int i;
for(i=0;str[i]!=0;i++)
if(islower(str[i])) printf("%c is a lower-case character\n",str[i]);
}
执行
c is a lower-case character
s is a lower-case character
e is a lower-case character</pre>