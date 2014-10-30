

kill（传送信号给指定的进程）
相关函数
raise，signal
表头文件
#include<sys/types.h>
#include<signal.h>
定义函数
int kill(pid_t pid,int sig);
函数说明
kill()可以用来送参数sig指定的信号给参数pid指定的进程。参数pid有几种情况:
pid>0 将信号传给进程识别码为pid 的进程。
pid=0 将信号传给和目前进程相同进程组的所有进程
pid=-1 将信号广播传送给系统内所有的进程
pid<0 将信号传给进程组识别码为pid绝对值的所有进程
参数sig代表的信号编号可参考附录D
返回值
执行成功则返回0，如果有错误则返回-1。
错误代码
EINVAL 参数sig 不合法
ESRCH 参数pid 所指定的进程或进程组不存在
EPERM 权限不够无法传送信号给指定进程
范例
#include<unistd.h>
#include<signal.h>
#include<sys/types.h>
#include<sys/wait.h>
main()
{
pid_t pid;
int status;
if(!(pid= fork())){
printf(“Hi I am child process!\n”);
sleep(10);
return;
}
else{
printf(“send signal to child process (%d) \n”,pid);
sleep(1);
kill(pid ,SIGABRT);
wait(&status);
if(WIFSIGNALED(status))
printf(“chile process receive signal %d\n”,WTERMSIG(status));
}
}
执行
sen signal to child process(3170)
Hi I am child process!
child process receive signal 6