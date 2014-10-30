close（关闭文件）
<pre>相关函数
open，fcntl，shutdown，unlink，fclose
表头文件
#include< unistd.h>
定义函数
int close(int fd);
函数说明
当使用完文件后若已不再需要则可使用close()关闭该文件，二close()会让数据写回磁盘，并释放该文件所占用的资源。参数fd为先前由open()或creat()所返回的文件描述词。
返回值
若文件顺利关闭则返回0，发生错误时返回-1。
错误代码
EBADF 参数fd 非有效的文件描述词或该文件已关闭。
附加说明
虽然在进程结束时，系统会自动关闭已打开的文件，但仍建议自行关闭文件，并确实检查返回值。
范例
参考open()</pre>