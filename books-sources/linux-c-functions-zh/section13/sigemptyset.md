

sigemptyset（初始化信号集）
相关函数
sigaddset，sigfillset，sigdelset，sigismember
表头文件
#include<signal.h>
定义函数
int sigemptyset(sigset_t *set);
函数说明
sigemptyset()用来将参数set信号集初始化并清空。
返回值
执行成功则返回0，如果有错误则返回-1。
错误代码
EFAULT 参数set指针地址无法存取