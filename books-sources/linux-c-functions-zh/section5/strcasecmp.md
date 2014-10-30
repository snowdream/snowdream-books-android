strcasecmp（忽略大小写比较字符串）
<pre>相关函数
bcmp，memcmp，strcmp，strcoll，strncmp
表头文件
#include< string.h>
定义函数
int strcasecmp (const char *s1, const char *s2);
函数说明
strcasecmp()用来比较参数s1和s2字符串，比较时会自动忽略大小写的差异。
返回值
若参数s1和s2字符串相同则返回0。s1长度大于s2长度则返回大于0 的值，s1 长度若小于s2 长度则返回小于0的值。
范例
#include < string.h>
main()
{
char *a="aBcDeF";
char *b="AbCdEf";
if(!strcasecmp(a,b))
printf("%s=%s\n",a,b);
}
执行
aBcDeF=AbCdEf</pre>