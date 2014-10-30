atoi（将字符串转换成整型数）
相关函数
atof，atol，atrtod，strtol，strtoul
表头文件
#include<stdlib.h>
定义函数
int atoi(const char *nptr);
函数说明
atoi()会扫描参数nptr字符串，跳过前面的空格字符，直到遇上数字或正负符号才开始做转换，而再遇到非数字或字符串结束时('\0')才结束转换，并将结果返回。
返回值
返回转换后的整型数。
附加说明
atoi()与使用strtol(nptr，(char**)NULL，10)；结果相同。
范例
/* 将字符串a 与字符串b转换成数字后相加*/
#include<stdlib.h>
mian()
{
char a[]=”-100”;
char b[]=”456”;
int c;
c=atoi(a)+atoi(b);
printf(c=%d\n”,c);
}
执行
c=356