putchar（将指定的字符写到标准输出设备）
<pre>相关函数
fopen，fwrite，fscanf，fputc
表头文件
#include< stdio.h>
定义函数
int putchar (int c);
函数说明
putchar()用来将参数c字符写到标准输出设备。
返回值
putchar()会返回输出成功的字符，即参数c。若返回EOF则代表输出失败。
附加说明
putchar()非真正函数，而是putc(c，stdout)宏定义。
范例
参考getchar()。</pre>