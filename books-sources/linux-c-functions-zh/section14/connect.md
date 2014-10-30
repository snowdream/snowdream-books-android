connect（建立socket连线）
<pre>相关函数
socket，bind，listen
表头文件
#include< sys/types.h>
#include< sys/socket.h>
定义函数
int connect (int sockfd,struct sockaddr * serv_addr,int addrlen);
函数说明
connect()用来将参数sockfd 的socket 连至参数serv_addr 指定的网络地址。结构sockaddr请参考bind()。参数addrlen为sockaddr的结构长度。
返回值
成功则返回0，失败返回-1，错误原因存于errno中。
错误代码
EBADF 参数sockfd 非合法socket处理代码
EFAULT 参数serv_addr指针指向无法存取的内存空间
ENOTSOCK 参数sockfd为一文件描述词，非socket。
EISCONN 参数sockfd的socket已是连线状态
ECONNREFUSED 连线要求被server端拒绝。
ETIMEDOUT 企图连线的操作超过限定时间仍未有响应。
ENETUNREACH 无法传送数据包至指定的主机。
EAFNOSUPPORT sockaddr结构的sa_family不正确。
EALREADY socket为不可阻断且先前的连线操作还未完成。
范例
/* 利用socket的TCP client
此程序会连线TCP server，并将键盘输入的字符串传送给server。
TCP server范例请参考listen（）。
*/
#include< sys/stat.h>
#include< fcntl.h>
#include< unistd.h>
#include< sys/types.h>
#include< sys/socket.h>
#include< netinet/in.h>
#include< arpa/inet.h>
#define PORT 1234
#define SERVER_IP “127.0.0.1”
main()
{
int s;
struct sockaddr_in addr;
char buffer[256];
if((s = socket(AF_INET,SOCK_STREAM,0))<0){
perror(“socket”);
exit(1);
}
/* 填写sockaddr_in结构*/
bzero(&addr,sizeof(addr));
addr.sin_family = AF_INET;
addr.sin_port=htons(PORT);
addr.sin_addr.s_addr = inet_addr(SERVER_IP);
/* 尝试连线*/
if(connect(s,&addr,sizeof(addr))<0){
perror(“connect”);
exit(1);
}
/* 接收由server端传来的信息*/
recv(s,buffer,sizeof(buffer),0);
printf(“%s\n”,buffer);
while(1){
bzero(buffer,sizeof(buffer));
/* 从标准输入设备取得字符串*/
read(STDIN_FILENO,buffer,sizeof(buffer));
/* 将字符串传给server端*/
if(send(s,buffer,sizeof(buffer),0)<0){
perror(“send”);
exit(1);
}
}
}
执行
$ ./connect
Welcome to server!
hi I am client! /*键盘输入*/
/*<Ctrl+C>中断程序*/</pre>