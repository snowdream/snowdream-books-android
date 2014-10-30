

htonl（将32位主机字符顺序转换成网络字符顺序）
<pre>相关函数
htons，ntohl，ntohs
表头文件
#include< netinet/in.h>
定义函数
unsigned long int htonl(unsigned long int hostlong);
函数说明
htonl（）用来将参数指定的32位hostlong 转换成网络字符顺序。
返回值
返回对应的网络字符顺序。
范例
参考getservbyport()或connect()。</pre>