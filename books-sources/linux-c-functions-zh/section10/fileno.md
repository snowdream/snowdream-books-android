fileno（返回文件流所使用的文件描述词）
相关函数
open，fopen
表头文件
#include<stdio.h>
定义函数
int fileno(FILE * stream);
函数说明
fileno()用来取得参数stream指定的文件流所使用的文件描述词。
返回值
返回文件描述词。
范例
#include<stdio.h>
main()
{
FILE * fp;
int fd;
fp=fopen(“/etc/passwd”,”r”);
fd=fileno(fp);
printf(“fd=%d\n”,fd);
fclose(fp);
}
执行
fd=3