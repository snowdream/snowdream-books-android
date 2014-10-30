setbuffer（设置文件流的缓冲区）
<pre>相关函数
setlinebuf，setbuf，setvbuf
表头文件
#include< stdio.h>
定义函数
void setbuffer(FILE * stream,char * buf,size_t size);
函数说明
在打开文件流后，读取内容之前，调用setbuffer()可用来设置文件流的缓冲区。参数stream为指定的文件流，参数buf指向自定的缓冲区起始地址，参数size为缓冲区大小。
返回值
</pre>