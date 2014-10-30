fchmod（改变文件的权限）
相关函数
chmod，stat，open，chown
表头文件
#include<sys/types.h>
#include<sys/stat.h>
定义函数
int fchmod(int fildes,mode_t mode);
函数说明
fchmod()会依参数mode权限来更改参数fildes所指文件的权限。参数fildes为已打开文件的文件描述词。参数mode请参考chmod（）。
返回值
权限改变成功则返回0，失败返回-1，错误原因存于errno。
错误原因
EBADF 参数fildes为无效的文件描述词。
EPERM 进程的有效用户识别码与欲修改权限的文件所有者不同，而且也不具root权限。
EROFS 欲写入权限的文件存在于只读文件系统内。
EIO I/O 存取错误。
范例
#include<sys/stat.h>
#include<fcntl.h>
main()
{
int fd;
fd = open (“/etc/passwd”,O_RDONLY);
fchmod(fd,S_IRUSR|S_IWUSR|S_IRGRP|S_IROTH);
close(fd);
}