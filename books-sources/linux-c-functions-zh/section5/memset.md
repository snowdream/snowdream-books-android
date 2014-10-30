memset（将一段内存空间填入某值）
<pre>相关函数
bzero，swab
表头文件
#include< string.h>
定义函数
void * memset (void *s ,int c, size_t n);
函数说明
memset()会将参数s所指的内存区域前n个字节以参数c填入，然后返回指向s的指针。在编写程序时，若需要将某一数组作初始化，memset()会相当方便。
返回值
返回指向s的指针。
附加说明
参数c虽声明为int， 但必须是unsigned char ，所以范围在0到255之间。
范例
#include < string.h>
main()
{
char s[30];
memset (s,'A',sizeof(s));
s[30]='\0';
printf("%s\n",s);
}
执行
AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA</pre>