malloc（配置内存空间）
<pre>相关函数
calloc，free，realloc，brk
表头文件
#include< stdlib.h>
定义函数
void * malloc(size_t size);
函数说明
malloc()用来配置内存空间，其大小由指定的size决定。
返回值
若配置成功则返回一指针，失败则返回NULL。
范例
void p = malloc(1024); /*配置1k的内存*/</pre>