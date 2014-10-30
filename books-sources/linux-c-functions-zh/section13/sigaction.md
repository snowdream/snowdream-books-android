

sigaction（查询或设置信号处理方式）
相关函数
signal，sigprocmask，sigpending，sigsuspend
表头文件
#include<signal.h>
定义函数
int sigaction(int signum,const struct sigaction *act ,struct sigaction *oldact);
函数说明
sigaction()会依参数signum指定的信号编号来设置该信号的处理函数。参数signum可以指定SIGKILL和SIGSTOP以外的所有信号。
如参数结构sigaction定义如下
struct sigaction
{
void (*sa_handler) (int);
sigset_t sa_mask;
int sa_flags;
void (*sa_restorer) (void);
}
sa_handler此参数和signal()的参数handler相同，代表新的信号处理函数，其他意义请参考signal()。
sa_mask 用来设置在处理该信号时暂时将sa_mask 指定的信号搁置。
sa_restorer 此参数没有使用。
sa_flags 用来设置信号处理的其他相关操作，下列的数值可用。
OR 运算（|）组合
A_NOCLDSTOP : 如果参数signum为SIGCHLD，则当子进程暂停时并不会通知父进程
SA_ONESHOT/SA_RESETHAND:当调用新的信号处理函数前，将此信号处理方式改为系统预设的方式。
SA_RESTART:被信号中断的系统调用会自行重启
SA_NOMASK/SA_NODEFER:在处理此信号未结束前不理会此信号的再次到来。
如果参数oldact不是NULL指针，则原来的信号处理方式会由此结构sigaction 返回。
返回值
执行成功则返回0，如果有错误则返回-1。
错误代码
EINVAL 参数signum 不合法， 或是企图拦截SIGKILL/SIGSTOPSIGKILL信号
EFAULT 参数act，oldact指针地址无法存取。
EINTR 此调用被中断
范例
#include<unistd.h>
#include<signal.h>
void show_handler(struct sigaction * act)
{
switch (act->sa_flags)
{
case SIG_DFL:printf(“Default action\n”);break;
case SIG_IGN:printf(“Ignore the signal\n”);break;
default: printf(“0x%x\n”,act->sa_handler);
}
}
main()
{
int i;
struct sigaction act,oldact;
act.sa_handler = show_handler;
act.sa_flags = SA_ONESHOT|SA_NOMASK;
sigaction(SIGUSR1,&act,&oldact);
for(i=5;i<15;i++)
{
printf(“sa_handler of signal %2d =”.i);
sigaction(i,NULL,&oldact);
}
}
执行
sa_handler of signal 5 = Default action
sa_handler of signal 6= Default action
sa_handler of signal 7 = Default action
sa_handler of signal 8 = Default action
sa_handler of signal 9 = Default action
sa_handler of signal 10 = 0x8048400
sa_handler of signal 11 = Default action
sa_handler of signal 12 = Default action
sa_handler of signal 13 = Default action
sa_handler of signal 14 = Default action