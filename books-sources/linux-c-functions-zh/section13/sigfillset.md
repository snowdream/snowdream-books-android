

sigfillset（将所有信号加入至信号集）
相关函数
sigempty，sigaddset，sigdelset，sigismember
表头文件
#include<signal.h>
定义函数
int sigfillset(sigset_t * set);
函数说明
sigfillset()用来将参数set信号集初始化，然后把所有的信号加入到此信号集里。
返回值
执行成功则返回0，如果有错误则返回-1。
附加说明
EFAULT 参数set指针地址无法存取