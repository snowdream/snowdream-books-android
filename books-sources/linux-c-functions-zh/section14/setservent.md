setservent（打开主机网络服务的数据文件）
相关函数
getservent, getservbyname, getservbyport, endservent
表头文件
#include < netdb.h >
定义函数
void setservent (int stayopen);
函数说明
setservent()用来打开/etc/services，如果参数stayopen值为1，则接下来的getservbyname()或getservbyport()将补回自动关闭文件。