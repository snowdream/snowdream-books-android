access（判断是否具有存取文件的权限）
<pre>相关函数
stat，open，chmod，chown，setuid，setgid
表头文件
#include< unistd.h>
定义函数
int access(const char * pathname,int mode);
函数说明
access()会检查是否可以读/写某一已存在的文件。参数mode有几种情况组合，R_OK，W_OK，X_OK 和F_OK。R_OK，W_OK与X_OK用来检查文件是否具有读取、写入和执行的权限。F_OK则是用来判断该文件是否存在。由于access()只作权限的核查，并不理会文件形态或文件内容，因此，如果一目录表示为“可写入”，表示可以在该目录中建立新文件等操作，而非意味此目录可以被当做文件处理。例如，你会发现DOS的文件都具有“可执行”权限，但用execve()执行时则会失败。
返回值
若所有欲查核的权限都通过了检查则返回0值，表示成功，只要有一权限被禁止则返回-1。
错误代码
EACCESS 参数pathname 所指定的文件不符合所要求测试的权限。
EROFS 欲测试写入权限的文件存在于只读文件系统内。
EFAULT 参数pathname指针超出可存取内存空间。
EINVAL 参数mode 不正确。
ENAMETOOLONG 参数pathname太长。
ENOTDIR 参数pathname为一目录。
ENOMEM 核心内存不足
ELOOP 参数pathname有过多符号连接问题。
EIO I/O 存取错误。
附加说明
使用access()作用户认证方面的判断要特别小心，例如在access()后再做open()的空文件可能会造成系统安全上的问题。
范例
/* 判断是否允许读取/etc/passwd */
#include< unistd.h>
int main()
{
if (access(“/etc/passwd”,R_OK) = =0)
printf(“/etc/passwd can be read\n”);
}
执行
/etc/passwd can be read</pre>