wait（等待子进程中断或结束）
相关函数
waitpid，fork
表头文件
#include<sys/types.h>
#include<sys/wait.h>
定义函数
pid_t wait (int * status);
函数说明
wait()会暂时停止目前进程的执行，直到有信号来到或子进程结束。如果在调用wait()时子进程已经结束，则wait()会立即返回子进程结束状态值。子进程的结束状态值会由参数status 返回，而子进程的进程识别码也会一快返回。如果不在意结束状态值，则
参数
status可以设成NULL。子进程的结束状态值请参考waitpid()。
返回值
如果执行成功则返回子进程识别码(PID)，如果有错误发生则返回-1。失败原因存于errno中。
附加说明

范例
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
main()
{
pid_t pid;
int status,i;
if(fork()= =0){
printf(“This is the child process .pid =%d\n”,getpid());
exit(5);
}else{
sleep(1);
printf(“This is the parent process ,wait for child...\n”;
pid=wait(&status);
i=WEXITSTATUS(status);
printf(“child’s pid =%d .exit status=^d\n”,pid,i);
}
}
执行
This is the child process.pid=1501
This is the parent process .wait for child...
child’s pid =1501,exit status =5