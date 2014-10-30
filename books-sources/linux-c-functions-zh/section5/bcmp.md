bcmp（比较内存内容）
<pre>相关函数
bcmp，strcasecmp，strcmp，strcoll，strncmp，strncasecmp
表头文件
#include< string.h>
定义函数
int bcmp ( const void *s1,const void * s2,int n);
函数说明
bcmp()用来比较s1和s2所指的内存区间前n个字节，若参数n为0，则返回0。
返回值
若参数s1 和s2 所指的内存内容都完全相同则返回0 值，否则返回非零值。
附加说明
建议使用memcmp()取代。
范例
参考memcmp()。</pre>