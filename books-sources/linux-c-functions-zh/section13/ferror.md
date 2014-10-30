
ferror（检查文件流是否有错误发生）
<pre>相关函数
clearerr，perror
表头文件
#include< stdio.h>
定义函数
int ferror(FILE *stream);
函数说明
ferror()用来检查参数stream所指定的文件流是否发生了错误情况，如有错误发生则返回非0值。
返回值
如果文件流有错误发生则返回非0值。</pre>