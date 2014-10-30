

pclose（关闭管道I/O）
相关函数
popen
表头文件
#include<stdio.h>
定义函数
int pclose(FILE * stream);
函数说明
pclose()用来关闭由popen所建立的管道及文件指针。参数stream为先前由popen()所返回的文件指针。
返回值
返回子进程的结束状态。如果有错误则返回-1，错误原因存于errno中。
错误代码
ECHILD pclose()无法取得子进程的结束状态。
范例
参考popen()。