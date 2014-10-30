fputs（将一指定的字符串写入文件内）
<pre>相关函数
fopen，fwrite，fscanf，fputc，putc
表头文件
#include< stdio.h>
定义函数
int fputs(const char * s,FILE * stream);
函数说明
fputs()用来将参数s所指的字符串写入到参数stream所指的文件内。
返回值
若成功则返回写出的字符个数，返回EOF则表示有错误发生。
范例
请参考fgets（）。</pre>