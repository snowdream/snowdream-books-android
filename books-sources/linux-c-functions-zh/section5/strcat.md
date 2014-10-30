strcat（连接两字符串）
相关函数
bcopy，memccpy，memcpy，strcpy，strncpy
表头文件
#include <string.h>
定义函数
char *strcat (char *dest,const char *src);
函数说明
strcat()会将参数src字符串拷贝到参数dest所指的字符串尾。第一个参数dest要有足够的空间来容纳要拷贝的字符串。
返回值
返回参数dest的字符串起始地址
范例
#include <string.h.>
main()
{
char a[30]="string(1)";
char b[]="string(2)";
printf("before strcat() : %s\n",a);
printf("after strcat() : %s\n",strcat(a,b));
}
执行
before strcat () : string(1)
after strcat () : string(1)string(2)