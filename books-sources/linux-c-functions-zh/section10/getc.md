getc（由文件中读取一个字符）
<pre>相关函数
read，fopen，fread，fgetc
表头文件
#include< stdio.h>
定义函数
int getc(FILE * stream);
函数说明
getc()用来从参数stream所指的文件中读取一个字符。若读到文件尾而无数据时便返回EOF。虽然getc()与fgetc()作用相同，但getc()为宏定义，非真正的函数调用。
返回值
getc()会返回读取到的字符，若返回EOF则表示到了文件尾。
范例
参考fgetc()。</pre>