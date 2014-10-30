

setsockopt（设置socket状态）
相关函数
getsockopt
表头文件
#include<sys/types.h>
#include<sys/socket.h>
定义函数
int setsockopt(int s,int level,int optname,const void * optval,,socklen_toptlen);
函数说明
setsockopt()用来设置参数s所指定的socket状态。参数level代表欲设置的网络层，一般设成SOL_SOCKET以存取socket层。参数optname代表欲设置的选项，有下列几种数值:
SO_DEBUG 打开或关闭排错模式
SO_REUSEADDR 允许在bind（）过程中本地地址可重复使用
SO_TYPE 返回socket形态。
SO_ERROR 返回socket已发生的错误原因
SO_DONTROUTE 送出的数据包不要利用路由设备来传输。
SO_BROADCAST 使用广播方式传送
SO_SNDBUF 设置送出的暂存区大小
SO_RCVBUF 设置接收的暂存区大小
SO_KEEPALIVE 定期确定连线是否已终止。
SO_OOBINLINE 当接收到OOB 数据时会马上送至标准输入设备
SO_LINGER 确保数据安全且可靠的传送出去。
参数
optval代表欲设置的值，参数optlen则为optval的长度。
返回值
成功则返回0，若有错误则返回-1，错误原因存于errno。
附加说明
EBADF 参数s并非合法的socket处理代码
ENOTSOCK 参数s为一文件描述词，非socket
ENOPROTOOPT 参数optname指定的选项不正确。
EFAULT 参数optval指针指向无法存取的内存空间。
范例
参考getsockopt()。