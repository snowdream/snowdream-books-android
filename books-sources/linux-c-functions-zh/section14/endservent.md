endservent（结束网络服务数据的读取）
相关函数
getservent，getservbyname，getservbyport，setservent
表头文件
#include<netdb.h>
定义函数
void endservent(void);
函数说明
endservent()用来关闭由getservent()所打开的文件。
返回值

范例
参考getservent()。