chmod（改变文件的权限）
相关函数
fchmod，stat，open，chown
表头文件
#include<sys/types.h>
#include<sys/stat.h>
定义函数
int chmod(const char * path,mode_t mode);
函数说明
chmod()会依参数mode 权限来更改参数path 指定文件的权限。
参数
mode 有下列数种组合
S_ISUID 04000 文件的（set user-id on execution）位
S_ISGID 02000 文件的（set group-id on execution）位
S_ISVTX 01000 文件的sticky位
S_IRUSR（S_IREAD） 00400 文件所有者具可读取权限
S_IWUSR（S_IWRITE）00200 文件所有者具可写入权限
S_IXUSR（S_IEXEC） 00100 文件所有者具可执行权限
S_IRGRP 00040 用户组具可读取权限
S_IWGRP 00020 用户组具可写入权限
S_IXGRP 00010 用户组具可执行权限
S_IROTH 00004 其他用户具可读取权限
S_IWOTH 00002 其他用户具可写入权限
S_IXOTH 00001 其他用户具可执行权限
只有该文件的所有者或有效用户识别码为0，才可以修改该文件权限。基于系统安全，如果欲将数据写入一执行文件，而该执行文件具有S_ISUID 或S_ISGID 权限，则这两个位会被清除。如果一目录具有S_ISUID 位权限，表示在此目录下只有该文件的所有者或root可以删除该文件。
返回值
权限改变成功返回0，失败返回-1，错误原因存于errno。
错误代码
EPERM 进程的有效用户识别码与欲修改权限的文件拥有者不同，而且也不具root权限。
EACCESS 参数path所指定的文件无法存取。
EROFS 欲写入权限的文件存在于只读文件系统内。
EFAULT 参数path指针超出可存取内存空间。
EINVAL 参数mode不正确
ENAMETOOLONG 参数path太长
ENOENT 指定的文件不存在
ENOTDIR 参数path路径并非一目录
ENOMEM 核心内存不足
ELOOP 参数path有过多符号连接问题。
EIO I/O 存取错误
范例
/* 将/etc/passwd 文件权限设成S_IRUSR|S_IWUSR|S_IRGRP|S_IROTH */
#include<sys/types.h>
#include<sys/stat.h>
main()
{
chmod(“/etc/passwd”,S_IRUSR|S_IWUSR|S_IRGRP|S_IROTH);
}