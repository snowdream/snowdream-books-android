bind（对socket定位）
相关函数
socket，accept，connect，listen
表头文件
#include<sys/types.h>
#include<sys/socket.h>
定义函数
int bind(int sockfd,struct sockaddr * my_addr,int addrlen);
函数说明
bind()用来设置给参数sockfd的socket一个名称。此名称由参数my_addr指向一sockaddr结构，对于不同的socket domain定义了一个通用的数据结构
struct sockaddr
{
unsigned short int sa_family;
char sa_data[14];
};
sa_family 为调用socket（）时的domain参数，即AF_xxxx值。
sa_data 最多使用14个字符长度。
此sockaddr结构会因使用不同的socket domain而有不同结构定义，例如使用AF_INET domain，其socketaddr结构定义便为
struct socketaddr_in
{
unsigned short int sin_family;
uint16_t sin_port;
struct in_addr sin_addr;
unsigned char sin_zero[8];
};
struct in_addr
{
uint32_t s_addr;
};
sin_family 即为sa_family
sin_port 为使用的port编号
sin_addr.s_addr 为IP 地址
sin_zero 未使用。
参数
addrlen为sockaddr的结构长度。
返回值
成功则返回0，失败返回-1，错误原因存于errno中。
错误代码
EBADF 参数sockfd 非合法socket处理代码。
EACCESS 权限不足
ENOTSOCK 参数sockfd为一文件描述词，非socket。
范例
参考listen()