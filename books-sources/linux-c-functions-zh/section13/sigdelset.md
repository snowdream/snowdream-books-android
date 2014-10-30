

sigdelset（从信号集里删除一个信号）
相关函数
sigemptyset，sigfillset，sigaddset，sigismember
表头文件
#include<signal.h>
定义函数
int sigdelset(sigset_t * set,int signum);
函数说明
sigdelset()用来将参数signum代表的信号从参数set信号集里删除。
返回值
执行成功则返回0，如果有错误则返回-1。
错误代码
EFAULT 参数set指针地址无法存取
EINVAL 参数signum非合法的信号编号