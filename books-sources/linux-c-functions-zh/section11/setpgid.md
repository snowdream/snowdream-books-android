setpgid（设置进程组识别码）
<pre>相关函数
getpgid，setpgrp，getpgrp
表头文件
#include< unistd.h>
定义函数
int setpgid(pid_t pid,pid_t pgid);
函数说明
setpgid()将参数pid 指定进程所属的组识别码设为参数pgid 指定的组识别码。如果参数pid 为0，则会用来设置目前进程的组识别码，如果参数pgid为0，则会以目前进程的进程识别码来取代。
返回值
执行成功则返回组识别码，如果有错误则返回-1，错误原因存于errno中。
错误代码
EINVAL 参数pgid小于0。
EPERM 进程权限不足，无法完成调用。
ESRCH 找不到符合参数pid指定的进程。</pre>