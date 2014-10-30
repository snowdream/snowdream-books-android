seteuid（设置有效的用户识别码）
相关函数
setuid，setreuid，setfsuid
表头文件
#include<unistd.h>
定义函数
int seteuid(uid_t euid);
函数说明
seteuid()用来重新设置执行目前进程的有效用户识别码。在Linux下，seteuid(euid)相当于setreuid(-1,euid)。
返回值
执行成功则返回0，失败则返回-1，错误代码存于errno
附加说明
请参考setuid