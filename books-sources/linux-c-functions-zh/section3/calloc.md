calloc（配置内存空间）
相关函数
malloc，free，realloc，brk
表头文件
#include <stdlib.h>
定义函数
void *calloc(size_t nmemb，size_t size);
函数说明
calloc()用来配置nmemb个相邻的内存单位，每一单位的大小为size，并返回指向第一个元素的指针。这和使用下列的方式效果相同:malloc(nmemb*size);不过，在利用calloc()配置内存时会将内存内容初始化为0。
返回值
若配置成功则返回一指针，失败则返回NULL。
范例
/* 动态配置10个struct test 空间*/
#include<stdlib.h>
struct test
{
int a[10];
char b[20];
}
main()
{
struct test *ptr=calloc(sizeof(struct test),10);
}