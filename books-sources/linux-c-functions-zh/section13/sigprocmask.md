

sigprocmask（查询或设置信号遮罩）
<pre>相关函数
signal，sigaction，sigpending，sigsuspend
表头文件
#include< signal.h>
定义函数
int sigprocmask(int how,const sigset_t *set,sigset_t * oldset);
函数说明
sigprocmask()可以用来改变目前的信号遮罩，其操作依参数how来决定
SIG_BLOCK 新的信号遮罩由目前的信号遮罩和参数set 指定的信号遮罩作联集
SIG_UNBLOCK 将目前的信号遮罩删除掉参数set指定的信号遮罩
SIG_SETMASK 将目前的信号遮罩设成参数set指定的信号遮罩。
如果参数oldset不是NULL指针，那么目前的信号遮罩会由此指针返回。
返回值
执行成功则返回0，如果有错误则返回-1。
错误代码
EFAULT 参数set，oldset指针地址无法存取。
EINTR 此调用被中断</pre>