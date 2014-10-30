

sigismember（测试某个信号是否已加入至信号集里）
相关函数
sigemptyset，sigfillset，sigaddset，sigdelset
表头文件
#include<signal.h>
定义函数
int sigismember(const sigset_t *set,int signum);
函数说明
sigismember()用来测试参数signum 代表的信号是否已加入至参数set信号集里。如果信号集里已有该信号则返回1，否则返回0。
返回值
信号集已有该信号则返回1，没有则返回0。如果有错误则返回-1。
错误代码
EFAULT 参数set指针地址无法存取
EINVAL 参数signum 非合法的信号编号