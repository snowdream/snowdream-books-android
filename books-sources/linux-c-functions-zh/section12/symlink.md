symlink（建立文件符号连接）
<pre>相关函数
link，unlink
表头文件
#include< unistd.h>
定义函数
int symlink( const char * oldpath,const char * newpath);
函数说明
symlink()以参数newpath指定的名称来建立一个新的连接(符号连接)到参数oldpath所指定的已存在文件。参数oldpath指定的文件不一定要存在，如果参数newpath指定的名称为一已存在的文件则不会建立连接。
返回值
成功则返回0，失败返回-1，错误原因存于errno。
错误代码
EPERM 参数oldpath与newpath所指的文件系统不支持符号连接
EROFS 欲测试写入权限的文件存在于只读文件系统内
EFAULT 参数oldpath或newpath指针超出可存取内存空间。
ENAMETOOLONG 参数oldpath或newpath太长
ENOMEM 核心内存不足
EEXIST 参数newpath所指的文件名已存在。
EMLINK 参数oldpath所指的文件已达到最大连接数目
ELOOP 参数pathname有过多符号连接问题
ENOSPC 文件系统的剩余空间不足
EIO I/O 存取错误
范例
#include< unistd.h>
main()
{
symlink(“/etc/passwd”,”pass”);
}</pre>