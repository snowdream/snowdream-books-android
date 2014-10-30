strncat（连接两字符串）
<pre>相关函数
bcopy，memccpy，memecpy，strcpy，strncpy
表头文件
#inclue <string.h>
定义函数
char * strncat(char *dest,const char *src,size_t n);
函数说明
strncat()会将参数src字符串拷贝n个字符到参数dest所指的字符串尾。第一个参数dest要有足够的空间来容纳要拷贝的字符串。
返回值
返回参数dest的字符串起始地址。
范例
#include < string.h>
main()
{
char a[30]="string(1)";
char b[]="string(2)";
printf("before strnact() :%s\n", a);
printf("after strncat() :%s\n", strncat(a,b,6));
}
执行
before strnact() : string(1)
after strncat() : string(1) string</pre>