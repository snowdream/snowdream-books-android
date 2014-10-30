ntohs（将16位网络字符顺序转换成主机字符顺序）
<pre>相关函数
htonl，htons，ntohl
表头文件
#include< netinet/in.h>
定义函数
unsigned short int ntohs(unsigned short int netshort);
函数说明
ntohs()用来将参数指定的16位netshort转换成主机字符顺序。
返回值
返回对应的主机顺序。
范例
参考getservent()。</pre>