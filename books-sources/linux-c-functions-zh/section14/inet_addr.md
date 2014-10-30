

inet_addr（将网络地址转成二进制的数字）
相关函数
inet_aton，inet_ntoa
表头文件
#include<sys/socket.h>
#include<netinet/in.h>
#include<arpa/inet.h>
定义函数
unsigned long int inet_addr(const char *cp);
函数说明
inet_addr()用来将参数cp所指的网络地址字符串转换成网络所使用的二进制数字。网络地址字符串是以数字和点组成的字符串，例如:“163.13.132.68”。
返回值
成功则返回对应的网络二进制的数字，失败返回-1。