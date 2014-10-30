

link（建立文件连接）
相关函数
symlink，unlink
表头文件
#include<unistd.h>
定义函数
int link (const char * oldpath,const char * newpath);
函数说明
link()以参数newpath指定的名称来建立一个新的连接(硬连接)到参数oldpath所指定的已存在文件。如果参数newpath指定的名称为一已存在的文件则不会建立连接。
返回值
成功则返回0，失败返回-1，错误原因存于errno。
附加说明
link()所建立的硬连接无法跨越不同文件系统，如果需要请改用symlink()。
错误代码
EXDEV 参数oldpath与newpath不是建立在同一文件系统。
EPERM 参数oldpath与newpath所指的文件系统不支持硬连接
EROFS 文件存在于只读文件系统内
EFAULT 参数oldpath或newpath 指针超出可存取内存空间。
ENAMETOLLONG 参数oldpath或newpath太长
ENOMEM 核心内存不足
EEXIST 参数newpath所指的文件名已存在。
EMLINK 参数oldpath所指的文件已达最大连接数目。
ELOOP 参数pathname有过多符号连接问题
ENOSPC 文件系统的剩余空间不足。
EIO I/O 存取错误。
范例
/* 建立/etc/passwd 的硬连接为pass */
#include<unistd.h>
main()
{
link(“/etc/passwd”,”pass”);
}