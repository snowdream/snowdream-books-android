inet_ntoa（将网络二进制的数字转换成网络地址）
相关函数
inet_addr，inet_aton
表头文件
#include<sys/socket.h>
#include<netinet/in.h>
#include<arpa/inet.h>
定义函数
char * inet_ntoa(struct in_addr in);
函数说明
inet_ntoa()用来将参数in所指的网络二进制的数字转换成网络地址，然后将指向此网络地址字符串的指针返回。
返回值
成功则返回字符串指针，失败则返回NULL。