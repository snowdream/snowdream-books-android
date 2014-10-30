setbuf（设置文件流的缓冲区）
<pre>相关函数
setbuffer，setlinebuf，setvbuf
表头文件
#include< stdio.h>
定义函数
void setbuf(FILE * stream,char * buf);
函数说明
在打开文件流后，读取内容之前，调用setbuf()可以用来设置文件流的缓冲区。参数stream为指定的文件流，参数buf指向自定的缓冲区起始地址。如果参数buf为NULL指针，则为无缓冲IO。Setbuf()相当于调用:setvbuf(stream,buf,buf?_IOFBF:_IONBF,BUFSIZ) 
返回值</pre>
