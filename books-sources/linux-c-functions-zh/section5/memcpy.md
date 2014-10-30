memcpy（拷贝内存内容）
<pre>相关函数
bcopy，memccpy，memcpy，memmove，strcpy，strncpy
表头文件
#include< string.h>
定义函数
void * memcpy (void * dest ,const void *src, size_t n);
函数说明
memcpy()用来拷贝src所指的内存内容前n个字节到dest所指的内存地址上。与strcpy()不同的是，memcpy()会完整的复制n个字节，不会因为遇到字符串结束'\0'而结束。
返回值
返回指向dest的指针。
附加说明
指针src和dest所指的内存区域不可重叠。
范例
#include< string.h>
main()
{
char a[30]="string (a)";
char b[30]="string\0string";
int i;
strcpy(a,b);
printf("strcpy():");
for(i=0;i<30;i++)
printf("%c",a[i]);
memcpy(a,b,30);
printf("\nmemcpy() :");
for(i=0;i<30;i++)
printf("%c",a[i]);
}
执行
strcpy() : string a )
memcpy() : string string</pre>