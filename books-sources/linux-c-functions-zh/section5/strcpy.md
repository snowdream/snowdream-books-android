strcpy（拷贝字符串）
相关函数
bcopy，memcpy，memccpy，memmove
表头文件
#include<string.h>
定义函数
char *strcpy(char *dest,const char *src);
函数说明
strcpy()会将参数src字符串拷贝至参数dest所指的地址。
返回值
返回参数dest的字符串起始地址。
附加说明
如果参数dest所指的内存空间不够大，可能会造成缓冲溢出(buffer Overflow)的错误情况，在编写程序时请特别留意，或者用strncpy()来取代。
范例
#include<string.h>
main()
{
char a[30]="string(1)";
char b[]="string(2)";
printf("before strcpy() :%s\n",a);
printf("after strcpy() :%s\n",strcpy(a,b));
}
执行
before strcpy() :string(1)
after strcpy() :string(2)