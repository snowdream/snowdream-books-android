fgets（由文件中读取一字符串）
<pre>相关函数
open，fread，fscanf，getc
表头文件
include< stdio.h>
定义函数
har * fgets(char * s,int size,FILE * stream);
函数说明
fgets()用来从参数stream所指的文件内读入字符并存到参数s所指的内存空间，直到出现换行字符、读到文件尾或是已读了size-1个字符为止，最后会加上NULL作为字符串结束。
返回值
gets()若成功则返回s指针，返回NULL则表示有错误发生。
范例
#include< stdio.h>
main()
{
char s[80];
fputs(fgets(s,80,stdin),stdout);
}
执行
this is a test /*输入*/
this is a test /*输出*/</pre>