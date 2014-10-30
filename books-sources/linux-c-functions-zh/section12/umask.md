

umask（设置建立新文件时的权限遮罩）
相关函数
creat，open
表头文件
#include<sys/types.h>
#include<sys/stat.h>
定义函数
mode_t umask(mode_t mask);
函数说明
umask()会将系统umask值设成参数mask&0777后的值，然后将先前的umask值返回。在使用open()建立新文件时，该参数mode并非真正建立文件的权限，而是(mode&~umask)的权限值。例如，在建立文件时指定文件权限为0666，通常umask值默认为022，则该文件的真正权限则为0666&～022＝0644，也就是rw-r--r--返回值此调用不会有错误值返回。返回值为原先系统的umask值。
　
