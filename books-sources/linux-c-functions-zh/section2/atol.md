atol（将字符串转换成长整型数）
<pre>相关函数
atof，atoi，strtod，strtol，strtoul
表头文件
#include< stdlib.h>
定义函数
long atol(const char *nptr);
函数说明
atol()会扫描参数nptr字符串，跳过前面的空格字符，直到遇上数字或正负符号才开始做转换，而再遇到非数字或字符串结束时('\0')才结束转换，并将结果返回。
返回值
返回转换后的长整型数。
附加说明
atol()与使用strtol(nptr,(char**)NULL,10)；结果相同。
范例
/*将字符串a与字符串b转换成数字后相加*/
#include< stdlib.h>
main()
{
char a[]=”1000000000”;
char b[]=” 234567890”;
long c;
c=atol(a)+atol(b);
printf(“c=%d\n”,c);
}
执行
c=1234567890</pre>