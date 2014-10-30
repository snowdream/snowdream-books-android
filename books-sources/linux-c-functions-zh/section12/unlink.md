
unlink（删除文件）
<pre>相关函数
link，rename，remove
表头文件
#include< unistd.h>
定义函数
int unlink(const char * pathname);
函数说明
unlink()会删除参数pathname指定的文件。如果该文件名为最后连接点，但有其他进程打开了此文件，则在所有关于此文件的文件描述词皆关闭后才会删除。如果参数pathname为一符号连接，则此连接会被删除。
返回值
成功则返回0，失败返回-1，错误原因存于errno
错误代码
EROFS 文件存在于只读文件系统内
EFAULT 参数pathname指针超出可存取内存空间
ENAMETOOLONG 参数pathname太长
ENOMEM 核心内存不足
ELOOP 参数pathname 有过多符号连接问题
EIO I/O 存取错误
　
</pre>