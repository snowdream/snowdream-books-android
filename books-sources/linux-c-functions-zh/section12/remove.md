remove（删除文件）
<pre>相关函数
link，rename，unlink
表头文件
#include< stdio.h>
定义函数
int remove(const char * pathname);
函数说明
remove()会删除参数pathname指定的文件。如果参数pathname为一文件，则调用unlink()处理，若参数pathname为一目录，则调用rmdir()来处理。请参考unlink()与rmdir()。
返回值
成功则返回0，失败则返回-1，错误原因存于errno。
错误代码
EROFS 欲写入的文件存在于只读文件系统内
EFAULT 参数pathname指针超出可存取内存空间
ENAMETOOLONG 参数pathname太长
ENOMEM 核心内存不足
ELOOP 参数pathname有过多符号连接问题
EIO I/O 存取错误。</pre>