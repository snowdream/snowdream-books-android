putc（将一指定字符写入文件中）
<pre>相关函数
fopen，fwrite，fscanf，fputc
表头文件
#include< stdio.h>
定义函数
int putc(int c,FILE * stream);
函数说明
putc()会将参数c转为unsigned char后写入参数stream指定的文件中。虽然putc()与fputc()作用相同，但putc()为宏定义，非真正的函数调用。
返回值
putc()会返回写入成功的字符，即参数c。若返回EOF则代表写入失败。
范例
参考fputc（）。</pre>