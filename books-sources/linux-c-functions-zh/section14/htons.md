

htons（将16位主机字符顺序转换成网络字符顺序）
相关函数
htonl，ntohl，ntohs
表头文件
#include<netinet/in.h>
定义函数
unsigned short int htons(unsigned short int hostshort);
函数说明
htons()用来将参数指定的16位hostshort转换成网络字符顺序。
返回值
返回对应的网络字符顺序。
范例
参考connect()。