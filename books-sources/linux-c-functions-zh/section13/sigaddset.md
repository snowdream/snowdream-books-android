

sigaddset（增加一个信号至信号集）
<pre>相关函数
sigemptyset，sigfillset，sigdelset，sigismember
表头文件
#include< signal.h>
定义函数
int sigaddset(sigset_t *set,int signum);
函数说明
sigaddset()用来将参数signum 代表的信号加入至参数set 信号集里。
返回值
执行成功则返回0，如果有错误则返回-1。
错误代码
EFAULT 参数set指针地址无法存取
EINVAL 参数signum非合法的信号编号</pre>