setlinebuf（设置文件流为线性缓冲区）
相关函数
setbuffer，setbuf，setvbuf
表头文件
#include<stdio.h>
定义函数
void setlinebuf(FILE * stream);
函数说明
setlinebuf()用来设置文件流以换行为依据的无缓冲IO。相当于调用:setvbuf(stream,(char * )NULL,_IOLBF,0);请参考setvbuf()。
返回值
