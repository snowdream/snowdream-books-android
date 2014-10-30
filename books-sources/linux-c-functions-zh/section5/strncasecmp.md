strncasecmp（忽略大小写比较字符串）
相关函数
bcmp，memcmp，strcmp，strcoll，strncmp
表头文件
#include<string.h>
定义函数
int strncasecmp(const char *s1,const char *s2,size_t n);
函数说明
strncasecmp()用来比较参数s1和s2字符串前n个字符，比较时会自动忽略大小写的差异。
返回值
若参数s1和s2 字符串相同则返回0。s1 若大于s2则返回大于0的值，s1若小于s2则返回小于0 的值。
范例
#include<string.h>
main()
{
char *a="aBcDeF";
char *b="AbCdEf";
if(!strncasecmp(a,b))
printf("%s =%s\n",a,b);
}
执行
aBcDef=AbCdEf