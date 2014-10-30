setfsuid（设置文件系统的用户识别码）
<pre>相关函数
setuid，setreuid，seteuid，setfsgid
表头文件
#include< unistd.h>
定义函数
int setfsuid(uid_t fsuid);
函数说明
setfsuid()用来重新设置目前进程的文件系统的用户识别码。一般情况下，文件系统的用户识别码(fsuid)与有效的用户识别码(euid)是相同的。如果是超级用户调用此函数，参数fsuid可以为任何值，否则参数fsuid必须为real/effective/saved的用户识别码之一。
返回值
执行成功则返回0，失败则返回-1，错误代码存于errno
附加说明
此函数为Linux特有
错误代码
EPERM 权限不够，无法完成设置。</pre>