feof（检查文件流是否读到了文件尾）
<pre>相关函数
fopen，fgetc，fgets，fread
表头文件
#include< stdio.h>
定义函数
int feof(FILE * stream);
函数说明
feof()用来侦测是否读取到了文件尾，尾数stream为fopen（）所返回之文件指针。如果已到文件尾则返回非零值，其他情况返回0。
返回值
返回非零值代表已到达文件尾。</pre>