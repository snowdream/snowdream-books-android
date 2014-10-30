

accept（接受socket连线）
<pre>相关函数
socket，bind，listen，connect
表头文件
#include< sys/types.h>
#include< sys/socket.h>
定义函数
int accept(int s,struct sockaddr * addr,int * addrlen);
函数说明
accept()用来接受参数s的socket连线。参数s的socket必需先经bind()、listen()函数处理过，当有连线进来时accept()会返回一个新的socket处理代码，往后的数据传送与读取就是经由新的socket处理，而原来参数s的socket能继续使用accept()来接受新的连线要求。连线成功时，参数addr所指的结构会被系统填入远程主机的地址数据，参数addrlen为scokaddr的结构长度。关于结构sockaddr的定义请参考bind()。
返回值
成功则返回新的socket处理代码，失败返回-1，错误原因存于errno中。
错误代码
EBADF 参数s 非合法socket处理代码。
EFAULT 参数addr指针指向无法存取的内存空间。
ENOTSOCK 参数s为一文件描述词，非socket。
EOPNOTSUPP 指定的socket并非SOCK_STREAM。
EPERM 防火墙拒绝此连线。
ENOBUFS 系统的缓冲内存不足。
ENOMEM 核心内存不足。
范例
参考listen()。</pre>