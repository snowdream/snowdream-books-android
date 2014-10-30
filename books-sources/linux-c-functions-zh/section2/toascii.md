toascii（将整型数转换成合法的ASCII 码字符）
相关函数
isascii，toupper，tolower
表头文件
#include<ctype.h>
定义函数
int toascii(int c)
函数说明
toascii()会将参数c转换成7位的unsigned char值，第八位则会被清除，此字符即会被转成ASCII码字符。
返回值
将转换成功的ASCII码字符值返回。
范例
#include<stdlib.h>
main()
{
int a=217;
char b;
printf(“before toascii () : a value =%d(%c)\n”,a,a);
b=toascii(a);
printf(“after toascii() : a value =%d(%c)\n”,b,b);
}
执行
before toascii() : a value =217()
after toascii() : a value =89(Y)