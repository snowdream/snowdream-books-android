ntohl（将32位网络字符顺序转换成主机字符顺序）
<pre>相关函数
htonl，htons，ntohs
表头文件
#include< netinet/in.h>
定义函数
unsigned long int ntohl(unsigned long int netlong);
函数说明
ntohl()用来将参数指定的32位netlong转换成主机字符顺序。
返回值
返回对应的主机字符顺序。
范例
参考getservent()。</pre>