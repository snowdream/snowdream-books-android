setvbuf（设置文件流的缓冲区）
相关函数
setbuffer，setlinebuf，setbuf
表头文件
#include<stdio.h>
定义函数
int setvbuf(FILE * stream,char * buf,int mode,size_t size);
函数说明
在打开文件流后，读取内容之前，调用setvbuf()可以用来设置文件流的缓冲区。参数stream为指定的文件流，参数buf指向自定的缓冲区起始地址，参数size为缓冲区大小，参数mode有下列几种
_IONBF 无缓冲IO
_IOLBF 以换行为依据的无缓冲IO
_IOFBF 完全无缓冲IO。如果参数buf为NULL指针，则为无缓冲IO。
返回值
