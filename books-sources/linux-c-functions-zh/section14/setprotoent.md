setprotoent（打开网络协议的数据文件）
相关函数
getprotobyname, getprotobynumber, endprotoent
表头文件
#include <netdb.h>
定义函数
void setprotoent (int stayopen);
函数说明
setprotoent()用来打开/etc/protocols， 如果参数stayopen值为1，则接下来的getprotobyname()或getprotobynumber()将不会自动关闭此文件。