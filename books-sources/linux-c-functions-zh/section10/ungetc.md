
ungetc（将指定字符写回文件流中）
相关函数
fputc，getchar，getc
表头文件
#include<stdio.h>
定义函数
int ungetc(int c,FILE * stream);
函数说明
ungetc()将参数c字符写回参数stream所指定的文件流。这个写回的字符会由下一个读取文件流的函数取得。
返回值
成功则返回c 字符，若有错误则返回EOF。