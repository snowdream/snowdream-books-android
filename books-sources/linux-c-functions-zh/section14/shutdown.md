

shutdown（终止socket通信）
<pre>相关函数
socket，connect
表头文件
#include< sys/socket.h>
定义函数
int shutdown(int s,int how);
函数说明
shutdown()用来终止参数s所指定的socket连线。参数s是连线中的socket处理代码，参数how有下列几种情况:
how=0 终止读取操作。
how=1 终止传送操作
how=2 终止读取及传送操作
返回值
成功则返回0，失败返回-1，错误原因存于errno。
错误代码
EBADF 参数s不是有效的socket处理代码
ENOTSOCK 参数s为一文件描述词，非socket
ENOTCONN 参数s指定的socket并未连线</pre>