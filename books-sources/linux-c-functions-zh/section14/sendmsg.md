sendmsg（经socket传送数据）
<pre>相关函数
send，sendto，recv，recvfrom，recvmsg，socket
表头文件
#include< sys/types.h>
#include< sys/socket.h>
定义函数
int sendmsg(int s,const strcut msghdr *msg,unsigned int flags);
函数说明
sendmsg()用来将数据由指定的socket传给对方主机。参数s为已建立好连线的socket，如果利用UDP协议则不需经过连线操作。参数msg 指向欲连线的数据结构内容，参数flags一般默认为0，详细描述请参考send()。
结构msghdr定义如下
struct msghdr
{
void *msg_name; /*Address to send to /receive from . */
socklen_t msg_namelen; /* Length of addres data */
strcut iovec * msg_iov; /* Vector of data to send/receive into */
size_t msg_iovlen; /* Number of elements in the vector */
void * msg_control; /* Ancillary dat */
size_t msg_controllen; /* Ancillary data buffer length */
int msg_flags; /* Flags on received message */
};
返回值
成功则返回实际传送出去的字符数，失败返回-1，错误原因存于errno
错误代码
EBADF 参数s 非合法的socket处理代码。
EFAULT 参数中有一指针指向无法存取的内存空间
ENOTSOCK 参数s为一文件描述词，非socket。
EINTR 被信号所中断。
EAGAIN 此操作会令进程阻断，但参数s的socket为不可阻断。
ENOBUFS 系统的缓冲内存不足
ENOMEM 核心内存不足
EINVAL 传给系统调用的参数不正确。
范例
参考sendto()。</pre>