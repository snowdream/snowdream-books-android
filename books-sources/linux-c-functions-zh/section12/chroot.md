

chroot（改变根目录）
相关函数
chdir
表头文件
#include<unistd.h>
定义函数
int chroot(const char * path);
函数说明
chroot()用来改变根目录为参数path 所指定的目录。只有超级用户才允许改变根目录，子进程将继承新的根目录。
返回值
调用成功则返回0，失败则返-1，错误代码存于errno。
错误代码
EPERM 权限不足，无法改变根目录。
EFAULT 参数path指针超出可存取内存空间。
ENAMETOOLONG 参数path太长。
ENOTDIR 路径中的目录存在但却非真正的目录。
EACCESS 存取目录时被拒绝
ENOMEM 核心内存不足。
ELOOP 参数path有过多符号连接问题。
EIO I/O 存取错误。
范例
/* 将根目录改为/tmp ,并将工作目录切换至/tmp */
#include<unistd.h>
main()
{
chroot(“/tmp”);
chdir(“/”);
}