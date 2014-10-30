memcmp（比较内存内容）
<pre>相关函数
bcmp，strcasecmp，strcmp，strcoll，strncmp，strncasecmp
表头文件
#include< string.h>
定义函数
int memcmp (const void *s1,const void *s2,size_t n);
函数说明
memcmp()用来比较s1和s2所指的内存区间前n个字符。字符串大小的比较是以ASCII码表上的顺序来决定，次顺序亦为字符的值。memcmp()首先将s1第一个字符值减去s2第一个字符的值，若差为0则再继续比较下个字符，若差值不为0则将差值返回。例如，字符串"Ac"和"ba"比较则会返回字符'A'(65)和'b'(98)的差值(－33)。
返回值
若参数s1和s2所指的内存内容都完全相同则返回0值。s1若大于s2则返回大于0的值。s1若小于s2则返回小于0的值。
范例
#include< string.h>
main()
{
char *a ="aBcDeF";
char *b="AbCdEf";
char *c="aacdef";
char *d="aBcDeF";
printf("memcmp(a,b):%d\n",memcmp((void*)a,(void*) b,6));
printf("memcmp(a,c):%d\n",memcmp((void*)a,(void*) c,6));
printf("memcmp(a,d):%d\n",memcmp((void*)a,(void*) d,6));
执行
memcmp(a,b):1 /*字符串a>字符串b，返回1*/
memcmp(a,c):-1 /* 字符串a<字符串c,返回－1*/
memcmp(a,d):0 /*字符串a＝字符串d，返回0*/</pre>