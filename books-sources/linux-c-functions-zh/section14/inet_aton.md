inet_aton（将网络地址转成网络二进制的数字）
相关函数
inet_addr，inet_ntoa
表头文件
#include<sys/scoket.h>
#include<netinet/in.h>
#include<arpa/inet.h>
定义函数
int inet_aton(const char * cp,struct in_addr *inp);
函数说明
inet_aton()用来将参数cp所指的网络地址字符串转换成网络使用的二进制的数字，然后存于参数inp所指的in_addr结构中。
结构in_addr定义如下
struct in_addr
{
unsigned long int s_addr;
};
返回值
成功则返回非0值，失败则返回0。