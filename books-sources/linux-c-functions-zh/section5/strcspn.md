strcspn（返回字符串中连续不含指定字符串内容的字符数）
相关函数
strspn
表头文件
#inclued<string.h>
定义函数
size_t strcspn ( const char *s,const char * reject);
函数说明
strcspn()从参数s字符串的开头计算连续的字符，而这些字符都完全不在参数reject 所指的字符串中。简单地说，若strcspn()返回的数值为n，则代表字符串s开头连续有n个字符都不含字符串reject内的字符。
返回值
返回字符串s开头连续不含字符串reject内的字符数目。
范例
#include <string.h>
main()
{
char *str="Linux was first developed for 386/486-based pcs.";
printf("%d\n",strcspn(str," "));
printf("%d\n",strcspn(str,"/-"));
printf("%d\n",strcspn(str,"1234567890"));
}
执行
5 /*只计算到“ ”的出现，所以返回“Linux”的长度*/
33 /*计算到出现“/”或“－”，所以返回到“6”的长度*/
30 /* 计算到出现数字字符为止，所以返回“3”出现前的长度*/