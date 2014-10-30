memccpy（拷贝内存内容）
相关函数
bcopy，memcpy，memmove，strcpy，strncpy
表头文件
#include<string.h>
定义函数
void * memccpy(void *dest, const void * src, int c,size_t n);
函数说明
memccpy()用来拷贝src所指的内存内容前n个字节到dest所指的地址上。与memcpy()不同的是，memccpy()会在复制时检查参数c是否出现，若是则返回dest中值为c的下一个字节地址。
返回值
返回指向dest中值为c的下一个字节指针。返回值为0表示在src所指内存前n个字节中没有值为c的字节。
范例
#include<string.h>
main()
{
char a[]="string[a]";
char b[]="string(b)";
memccpy(a,b,'B',sizeof(b));
printf("memccpy():%s\n",a);
}
执行
memccpy():string(b)