strlen（返回字符串长度）
相关函数

表头文件
#include<string.h>
定义函数
size_t strlen (const char *s);
函数说明
strlen()用来计算指定的字符串s的长度，不包括结束字符"\0"。
返回值
返回字符串s的字符数。
范例
/*取得字符串str的长度*/
#include<string.h>
main()
{
char *str = "12345678";
printf("str length = %d\n", strlen(str));
}
执行
str length = 8