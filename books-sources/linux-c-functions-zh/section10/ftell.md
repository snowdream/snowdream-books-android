ftell（取得文件流的读取位置）
<pre>相关函数
fseek，rewind，fgetpos，fsetpos
表头文件
#include< stdio.h>
定义函数
long ftell(FILE * stream);
函数说明
ftell()用来取得文件流目前的读写位置。参数stream为已打开的文件指针。
返回值
当调用成功时则返回目前的读写位置，若有错误则返回-1，errno会存放错误代码。
错误代码
EBADF 参数stream无效或可移动读写位置的文件流。
范例
参考fseek()。</pre>
　
