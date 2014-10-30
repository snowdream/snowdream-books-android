sigpending（查询被搁置的信号）
相关函数
signal，sigaction，sigprocmask，sigsuspend
表头文件
#include<signal.h>
定义函数
int sigpending(sigset_t *set);
函数说明
sigpending()会将被搁置的信号集合由参数set指针返回。
返回值执
行成功则返回0，如果有错误则返回-1。
错误代码
EFAULT 参数set指针地址无法存取
EINTR 此调用被中断。