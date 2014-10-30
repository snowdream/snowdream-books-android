send（经socket传送数据）
<pre>相关函数
sendto，sendmsg，recv，recvfrom，socket
表头文件
#include< sys/types.h>
#include< sys/socket.h>
定义函数
int send(int s,const void * msg,int len,unsigned int falgs);
函数说明
send()用来将数据由指定的socket 传给对方主机。参数s为已建立好连接的socket。参数msg指向欲连线的数据内容，参数len则为数据长度。参数flags一般设0，其他数值定义如下
MSG_OOB 传送的数据以out-of-band 送出。
MSG_DONTROUTE 取消路由表查询
MSG_DONTWAIT 设置为不可阻断运作
MSG_NOSIGNAL 此动作不愿被SIGPIPE 信号中断。
返回值
成功则返回实际传送出去的字符数，失败返回-1。错误原因存于errno
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
参考connect()</pre>