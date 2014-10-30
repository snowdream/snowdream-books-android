
fclose（关闭文件）
<pre>相关函数
close，fflush，fopen，setbuf
表头文件
#include< stdio.h>
定义函数
int fclose(FILE * stream);
函数说明
fclose()用来关闭先前fopen()打开的文件。此动作会让缓冲区内的数据写入文件中，并释放系统所提供的文件资源。
返回值
若关文件动作成功则返回0，有错误发生时则返回EOF并把错误代码存到errno。
错误代码
EBADF表示参数stream非已打开的文件。
范例
请参考fopen（）。</pre>