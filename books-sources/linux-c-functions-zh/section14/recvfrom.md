recvfrom（经socket接收数据）
<pre>相关函数
recv，recvmsg，send，sendto，socket
表头文件
#include< sys/types.h>
#include< sys/socket.h>
定义函数
int recvfrom(int s,void *buf,int len,unsigned int flags ,struct sockaddr *from ,int *fromlen);
函数说明
recv()用来接收远程主机经指定的socket 传来的数据，并把数据存到由参数buf 指向的内存空间，参数len 为可接收数据的最大长度。参数flags 一般设0，其他数值定义请参考recv()。参数from用来指定欲传送的网络地址，结构sockaddr 请参考bind()。参数fromlen为sockaddr的结构长度。
返回值
成功则返回接收到的字符数，失败则返回-1，错误原因存于errno中。
错误代码
EBADF 参数s非合法的socket处理代码
EFAULT 参数中有一指针指向无法存取的内存空间。
ENOTSOCK 参数s为一文件描述词，非socket。
EINTR 被信号所中断。
EAGAIN 此动作会令进程阻断，但参数s的socket为不可阻断。
ENOBUFS 系统的缓冲内存不足
ENOMEM 核心内存不足
EINVAL 传给系统调用的参数不正确。
范例
/*利用socket的UDP client
此程序会连线UDP server，并将键盘输入的字符串传给server。
UDP server 范例请参考sendto（）。
*/
#include< sys/stat.h>
#include< fcntl.h>
#include< unistd.h>
#include< sys/typs.h>
#include< sys/socket.h>
#include< netinet/in.h>
#include< arpa/inet.h>
#define PORT 2345
#define SERVER_IP “127.0.0.1”
main()
{
int s,len;
struct sockaddr_in addr;
int addr_len =sizeof(struct sockaddr_in);
char buffer[256];
/* 建立socket*/
if((s = socket(AF_INET,SOCK_DGRAM,0))<0){
perror(“socket”);
exit(1);
}
/* 填写sockaddr_in*/
bzero(&addr,sizeof(addr));
addr.sin_family = AF_INET;
addr.sin_port = htons(PORT);
addr.sin_addr.s_addr = inet_addr(SERVER_IP);
while(1){
bzero(buffer,sizeof(buffer));
/* 从标准输入设备取得字符串*/
len =read(STDIN_FILENO,buffer,sizeof(buffer));
/* 将字符串传送给server端*/
sendto(s,buffer,len,0,&addr,addr_len);
/* 接收server端返回的字符串*/
len = recvfrom(s,buffer,sizeof(buffer),0,&addr,&addr_len);
printf(“receive: %s”,buffer);
}
}
执行
(先执行udp server 再执行udp client)
hello /*从键盘输入字符串*/
receive: hello /*server端返回来的字符串*/</pre>