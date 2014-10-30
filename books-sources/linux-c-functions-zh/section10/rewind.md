rewind（重设文件流的读写位置为文件开头）
相关函数
fseek，ftell，fgetpos，fsetpos
表头文件
#include<stdio.h>
定义函数
void rewind(FILE * stream);
函数说明
rewind()用来把文件流的读写位置移至文件开头。参数stream为已打开的文件指针。此函数相当于调用fseek(stream,0,SEEK_SET)。
返回值

范例
参考fseek()