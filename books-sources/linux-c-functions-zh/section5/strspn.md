strspn（返回字符串中连续不含指定字符串内容的字符数）
相关函数
strcspn，strchr，strpbrk，strsep，strstr
表头文件
#include<string.h>
定义函数
size_t strspn (const char *s,const char * accept);
函数说明
strspn()从参数s 字符串的开头计算连续的字符，而这些字符都完全是accept 所指字符串中的字符。简单的说，若strspn()返回的数值为n，则代表字符串s 开头连续有n 个字符都是属于字符串accept内的字符。
返回值
返回字符串s开头连续包含字符串accept内的字符数目。
范例
#include<string.h>
main()
{
char *str="Linux was first developed for 386/486-based PCs.";
char *t1="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
printf("%d\n",strspn(str,t1));
}
执行
5 /*计算大小写字母。不包含“ ”，所以返回Linux的长度。*/