

sendto（经socket传送数据）
相关函数
send , sendmsg,recv , recvfrom , socket
表头文件
#include < sys/types.h >
#include < sys/socket.h >
定义函数
int sendto ( int s , const void * msg, int len, unsigned int flags, const 
struct sockaddr * to , int tolen ) ;
函数说明
sendto() 用来将数据由指定的socket传给对方主机。参数s为已建好连线的socket,如果利用UDP协议则不需经过连线操作。参数msg指向欲连线的数据内容，参数flags 一般设0，详细描述请参考send()。参数to用来指定欲传送的网络地址，结构sockaddr请参考bind()。参数tolen为sockaddr的结果长度。
返回值
成功则返回实际传送出去的字符数，失败返回－1，错误原因存于errno 中。
错误代码
EBADF 参数s非法的socket处理代码。
EFAULT 参数中有一指针指向无法存取的内存空间。
WNOTSOCK canshu s为一文件描述词，非socket。
EINTR 被信号所中断。
EAGAIN 此动作会令进程阻断，但参数s的soket为补课阻断的。
ENOBUFS 系统的缓冲内存不足。
EINVAL 传给系统调用的参数不正确。
范例
#include < sys/types.h >
#include < sys/socket.h >
# include <netinet.in.h>
#include <arpa.inet.h>
#define PORT 2345 /*使用的port*/
main(){
int sockfd,len;
struct sockaddr_in addr;
char buffer[256];
/*建立socket*/
if(sockfd=socket (AF_INET,SOCK_DGRAM,0))<0){
perror (“socket”);
exit(1);
}
/*填写sockaddr_in 结构*/
bzero ( &addr, sizeof(addr) );
addr.sin_family=AF_INET;
addr.sin_port=htons(PORT);
addr.sin_addr=hton1(INADDR_ANY) ;
if (bind(sockfd, &addr, sizeof(addr))<0){
perror(“connect”);
exit(1);
}
while(1){
bezro(buffer,sizeof(buffer));
len = recvfrom(socket,buffer,sizeof(buffer), 0 , &addr &addr_len);
/*显示client端的网络地址*/
printf(“receive from %s\n “ , inet_ntoa( addr.sin_addr));
/*将字串返回给client端*/
sendto(sockfd,buffer,len,0,&addr,addr_len);”
}
}
执行
请参考recvfrom()