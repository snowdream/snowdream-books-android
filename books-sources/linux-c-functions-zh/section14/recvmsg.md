recvmsg（经socket接收数据）
相关函数
recv，recvfrom，send，sendto，sendmsg，socket
表头文件
#include<sys/types.h>
#include<sys/socktet.h>
定义函数
int recvmsg(int s,struct msghdr *msg,unsigned int flags);
函数说明
recvmsg()用来接收远程主机经指定的socket传来的数据。参数s为已建立好连线的socket，如果利用UDP协议则不需经过连线操作。参数msg指向欲连线的数据结构内容，参数flags一般设0，详细描述请参考send()。关于结构msghdr的定义请参考sendmsg()。
返回值
成功则返回接收到的字符数，失败则返回-1，错误原因存于errno中。
错误代码
EBADF 参数s非合法的socket处理代码。
EFAULT 参数中有一指针指向无法存取的内存空间
ENOTSOCK 参数s为一文件描述词，非socket。
EINTR 被信号所中断。
EAGAIN 此操作会令进程阻断，但参数s的socket为不可阻断。
ENOBUFS 系统的缓冲内存不足
ENOMEM 核心内存不足
EINVAL 传给系统调用的参数不正确。
范例
参考recvfrom()。