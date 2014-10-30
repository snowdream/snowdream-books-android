strstr（在一字符串中查找指定的字符串）
相关函数
index，memchr，rindex，strchr，strpbrk，strsep，strspn，strtok
表头文件
#include<string.h>
定义函数
char *strstr(const char *haystack,const char *needle);
函数说明
strstr()会从字符串haystack 中搜寻字符串needle，并将第一次出现的地址返回。
返回值
返回指定字符串第一次出现的地址，否则返回0。
范例
#include<string.h>
main()
{
char * s="012345678901234567890123456789";
char *p;
p= strstr(s,"901");
printf("%s\n",p);
}
执行
9.01E+21