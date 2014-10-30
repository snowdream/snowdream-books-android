recv（经socket接收数据）
相关函数
recvfrom，recvmsg，send，sendto，socket
表头文件
#include<sys/types.h>
#include<sys/socket.h>
定义函数
int recv(int s,void *buf,int len,unsigned int flags);
函数说明
recv()用来接收远端主机经指定的socket传来的数据，并把数据存到由参数buf 指向的内存空间，参数len为可接收数据的最大长度。
参数
flags一般设0。其他数值定义如下:
MSG_OOB 接收以out-of-band 送出的数据。
MSG_PEEK 返回来的数据并不会在系统内删除，如果再调用recv()会返回相同的数据内容。
MSG_WAITALL强迫接收到len大小的数据后才能返回，除非有错误或信号产生。
MSG_NOSIGNAL此操作不愿被SIGPIPE信号中断返回值成功则返回接收到的字符数，失败返回-1，错误原因存于errno中。
错误代码
EBADF 参数s非合法的socket处理代码
EFAULT 参数中有一指针指向无法存取的内存空间
ENOTSOCK 参数s为一文件描述词，非socket。
EINTR 被信号所中断
EAGAIN 此动作会令进程阻断，但参数s的socket为不可阻断
ENOBUFS 系统的缓冲内存不足。
ENOMEM 核心内存不足
EINVAL 传给系统调用的参数不正确。
范例
参考listen()。