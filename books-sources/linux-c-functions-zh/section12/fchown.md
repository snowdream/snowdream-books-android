fchown（改变文件的所有者）
相关函数
chown，lchown，chmod
表头文件
#include<sys/types.h>
#include<unistd.h>
定义函数
int fchown(int fd,uid_t owner,gid_t group);
函数说明
fchown()会将参数fd指定文件的所有者变更为参数owner代表的用户，而将该文件的组变更为参数group组。如果参数owner或group为-1，对映的所有者或组有所改变。参数fd 为已打开的文件描述词。当root用fchown()改变文件所有者或组时，该文件若具S_ISUID或S_ISGID权限，则会清除此权限位。
返回值
成功则返回0，失败则返回-1，错误原因存于errno。
错误代码
EBADF 参数fd文件描述词为无效的或该文件已关闭。
EPERM 进程的有效用户识别码与欲修改权限的文件所有者不同，而且也不具root权限，或是参数owner、group不正确。
EROFS 欲写入的文件存在于只读文件系统内。
ENOENT 指定的文件不存在
EIO I/O存取错误
范例
#include<sys/types.h>
#include<unistd.h>
#include<fcntl.h>
main()
{
int fd;
fd = open (“/etc/passwd”,O_RDONLY);
chown(fd,0,0);
close(fd);
}